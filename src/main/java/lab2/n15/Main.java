package lab2.n15;

public class Main {
    public static void main(String[] args) {
        Invoice arr = new Invoice();
        arr.addItem("Apple", 10, 100);
        arr.addItem("Macbook", 1, Double.POSITIVE_INFINITY);
        arr.getInvoce();
    }
}
