package lab3.dop;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MyIterator<T> implements MyIteratorInterface<T> {
    @Override
    public T next(){
        return null;
    }

    @Override
    public boolean hasNext(){
        return true;
    }

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

    public <TO> MyIterator<TO> map(Function<T, TO> function){
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

}
