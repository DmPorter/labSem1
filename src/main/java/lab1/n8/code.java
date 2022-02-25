package lab1.n8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class code {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        for (int end = str.length(); end > 0; end--) {
            for (int start = 0; start < end; start++) {
                arr.add(str.substring(start, end));
                System.out.println(str.substring(start, end));
            }
        }

        System.out.println(Arrays.toString(arr.toArray()));
    }
}
