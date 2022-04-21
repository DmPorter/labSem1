package lab2.dop2;

import lab2.n14.Network;
import lab2.n15.Invoice;

public class Use {
    public static void main(String[] args) {
        Invoice a = new Invoice();
        Invoice.Item it1 = new Invoice.Item();
        
        Network n = new Network();
        Network.Member nm = n.new Member("asdasd");
        Network.Member nm1 = new Network().new Member("asdasd");
    }
}
