package lab2.n15;

import java.util.ArrayList;

public class Invoice {

    public static class Item {
        String description;
        int quantity;
        double unitPrice;
        double price() { return quantity * unitPrice; }
    }
    private final ArrayList<Item> items = new ArrayList<> () ;

    public void addItem(String description, int quantity,
                        double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void getInvoce(){

        System.out.printf("%-2s | %-16s | %-10s | %-10s | %-10s\n", "№", "Item", "Quantity", "Price", "Total Price");

        for(int i = 0; i < this.items.size(); i++){
            System.out.format("%-2d | %-16s | %-10d | %-10.2f | %-10.2f\n", (i + 1),  this.items.get(i).description, this.items.get(i).quantity, this.items.get(i).unitPrice, this.items.get(i).price());
        }
    }
    }

