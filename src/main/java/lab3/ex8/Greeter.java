package lab3.ex8;

public class Greeter implements Runnable {
    final int n;
    final String target;

    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for(int i = 0; i < n; i++){
            System.out.println("Hello " + target);
        }
    }
}
