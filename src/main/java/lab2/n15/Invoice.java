package lab2.n15;

import java.util.ArrayList;

public class Invoice {

    private static class Item { // Класс Item вложен в класс Invoice
        String description;
        int quantity;
        double unitPrice;
        double price() { return quantity * unitPrice; }
    }
    private ArrayList<Item> items = new ArrayList<> () ;

    public void addltem(String description, int quantity,
                        double unitPrice) {
        Item newltem = new Item();
        newltem.description = description;
        newltem.quantity = quantity;
        newltem.unitPrice = unitPrice;
        items.add(newltem);
    }

    public String getInvoce(){
        StringBuilder str = new StringBuilder();
        str.append("№\tItem\tQuantity\tPrice\tTotal Price\n");

        for(int i = 0; i < this.items.size(); i++){
            String new_line = "" + (i+1) + "\t" + this.items.get(i).description + "\t" + this.items.get(i).quantity + "\t" + this.items.get(i).unitPrice + "\t" + this.items.get(i).price() + "\n";
            str.append(new_line);
        }
        return str.toString();
    }
    }

