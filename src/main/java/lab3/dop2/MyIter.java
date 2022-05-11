package lab3.dop2;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface MyIter<T> {

    T next();
    boolean hasNext();

    static <T> MyIter<T> fromIterator(Iterator<T> iterator) {
        return new MyIter() {
            @Override
            public T next() {
                return iterator.next();
            }

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }
        };
    }

    default MyIter<T> filter(Predicate<T> t) {
        MyIter<T> iterator2 = this;
        return new MyIter<T>() {
            T nextElement;
            boolean existElement = false;

            @Override
            public T next() {
                if (!existElement && !hasNext()) {
                    return null;
                } else {
                    existElement = false;
                    return nextElement;
                }
            }

            @Override
            public boolean hasNext() {
                while (iterator2.hasNext()) {
                    T object = iterator2.next();
                    if (t.test(object)) {
                        nextElement = object;
                        existElement = true;
                        return true;
                    }
                }
                return false;
            }
        };
    }

    default Collection<T> collect(Supplier<Collection<T>> collector) {
        Collection<T> result = collector.get();
        while (this.hasNext()) {
            result.add(this.next());
        }
        return result;
    }

}
