package smth;

public interface Int2 {
    boolean hasNext();

    default void getId(){
        System.out.println("Int2");
    }
}
