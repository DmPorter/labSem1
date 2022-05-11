package lab3.dop3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public interface MyIterator<T> {
    T next();
    boolean hasNext();

    static <T> MyIterator<T> fromIterator(Iterator<T> iterator){
        return new MyIterator<T>(){
            @Override
            public T next(){
                return iterator.next();
            }

            @Override
            public boolean hasNext(){
                return iterator.hasNext();
            }
        };
    }

    default <TO> MyIterator<TO> map(Function<T, TO> function){
        MyIterator<T> it = this;
        return new MyIterator<TO>() {
            @Override
            public TO next() {
                return function.apply(it.next());
            }

            @Override
            public boolean hasNext() {
                return it.hasNext();
            }
        };
    }

    default <TO> Map<TO, List<T>> collectToMap(){
        return null;
    }
}
