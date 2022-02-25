package lab2.n16;

public class Queue {

    Node first;
    Node last;

    void add(String str){
        Node item = new Node(str);

        if(this.last == null){
            this.last = this.first = item;

            return;
        }

        this.last.next = item;
        this.last = item;
    }


    void remove(){
        if(this.first == null){
            return;
        }

        Node item = this.first;

        this.first = this.first.next;


        if(this.first == null)
            this.last = null;

    }

    Iterator iterator(){
        return new Iterator();
    }

    static class Node{
        String item;
        Node next = null;

        Node(String item){this.item = item;}

        public String toString(){
            return ""+ item;
        }

    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        Node item = this.first;
        int i = 0;
        while (item != null){
            str.append("i = ").append(i).append(" item: ").append(item.item).append("\n");
            i++;
            item = item.next;
        }
        return str.toString();
    }
    class Iterator{
        Node item;

        Iterator(){
            this.item = first;
        }

        Node next(){
            Node a = item;
            item = item.next;
            return a;
        }

        boolean hasNext(){
            return this.item != null && this.item.next != null;
        }
    }
}
