package lab4.dopProxy;

public interface IntSequence {
    int next();

    boolean hasNext();

    default int nextMultiply(int val){
        return val * next();
    }
}
