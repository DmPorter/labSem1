package smth;

public interface Int1 {
    boolean next();
    default void getId(){
        System.out.println("Int1");
    }
}
