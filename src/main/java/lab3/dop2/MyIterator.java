package lab3.dop2;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyIterator<T>  implements MyIter<T> {
    @Override
    public T next(){
        return null;
    }
    @Override
    public boolean hasNext(){
        return true;
    }

    static <T> MyIterator<T> fromIterator(Iterator<T> iterator){
        return new MyIterator<>() {
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

    public MyIterator<T> filter(Predicate<T> t) {
        MyIterator<T> iterator2 = this;
        return new MyIterator<T>() {
            T Element;

            @Override
            public T next() {
                return Element;
            }
            @Override
            public boolean hasNext() {
                while (iterator2.hasNext()){
                    T object = iterator2.next();
                    if (t.test(object)) {
                        Element = object;
                        return true;
                    }
                }
                return false;
            }
        };
    }

}
