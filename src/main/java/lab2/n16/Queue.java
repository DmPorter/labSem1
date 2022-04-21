package lab2.n16;

public class Queue {

    private Node first;
    private Node last;

    public void add(String str){
        Node item = new Node(str);

        if(this.last == null){
            this.last = this.first = item;
            return;
        }

        this.last.next = item;
        this.last = item;
    }


    public Node remove(){
        if(this.first == null){
            return null;
        }

        Node item = this.first;

        this.first = this.first.next;


        if(this.first == null)
            this.last = null;

        return item;
    }

    public Iterator iterator(){
        return new Iterator();
    }

    private static class Node{
        private String item;
        private Node next = null;

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

    public class Iterator{
        private Node item;

        public Iterator(){
            this.item = first;
        }

        public Node next(){
            if (item == null)
                return null;
            Node a = item;
            if (hasNext())
                item = item.next;
            else{
                item = null;
            }
            return a;
        }

        public boolean hasNext(){
            return this.item.next != null;
        }
    }
}
