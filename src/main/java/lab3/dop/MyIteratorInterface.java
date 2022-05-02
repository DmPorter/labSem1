package lab3.dop;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

interface MyIteratorInterface<T> {

    T next();

    boolean hasNext();

    default <TO> MyIteratorInterface<TO> map(Function<T, TO> function){
        MyIteratorInterface<T> it = this;
        return new MyIteratorInterface<TO>() {
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

    default void forEach(Consumer<T> action){
        while(hasNext()) action.accept(this.next());
    }

}
