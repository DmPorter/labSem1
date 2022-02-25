package lab1.n11;

public class code {
    public static void main(String[] args){
        String asd = "asddddĬĭ";
        int[] utf =  asd.codePoints().toArray();
        for(int i = 0; i < utf.length; i++){
            if (utf[i] > 255)
                System.out.println((char)utf[i] + " " + utf[i]);
        }
    }
}
