package lab4.ex6;

public class Main {
    public static void main(String[] args) {
        DiscountedItem x = new DiscountedItem("item", 1, 0.05);
        Item y = new Item("item", 1);
        DiscountedItem z = new DiscountedItem("item", 1, 0.1);

        //Транзитивность
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));

        System.out.println();
        //Симмитричность
        System.out.println(y.equals(x));
        System.out.println(z.equals(y));
        System.out.println(z.equals(x));

    }
}
