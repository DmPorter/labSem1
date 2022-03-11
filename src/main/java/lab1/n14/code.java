package lab1.n14;

import java.util.ArrayList;
import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        String data = in.nextLine();
        while(!data.isEmpty()){
            ArrayList<Integer> line = new ArrayList<>();
            for (String l : data.split(" ")){
                line.add(Integer.parseInt(l));
            }
            arr.add(line);
            data = in.nextLine();
        }

        if (square(arr)){
            int sum_dig_one = 0;
            for (int i = 0; i < arr.size();i++ ){
                sum_dig_one += arr.get(i).get(i);
            }
            int sum_dig_two = 0;
            for (int i = 0; i < arr.size();i++ ){
                sum_dig_two += arr.get(arr.size() - i - 1).get(i);
            }
            int sumRow = SumRow(arr);
            int sumCol = SumCol(arr);
            if (sum_dig_two == sum_dig_one && SumRow(arr) == sumCol && sumCol == sum_dig_one )
                System.out.println("Ok");
            else
                System.out.println("Not ok");
        }
        else{
            System.out.println("It isn't square!");
        }
    }

    public static int SumRow(ArrayList<ArrayList<Integer>> arr){
        int sum = 0;
        for (int l = 0; l < arr.get(0).size(); l++){
            sum += arr.get(0).get(l);
        }
        for (int i = 1; i < arr.size(); i++){
            int sum_new = 0;
            for (int l = 0; l < arr.get(i).size(); l++){
                sum_new += arr.get(i).get(l);
            }
            if (sum_new != sum)
                return -1;
        }
        return sum;
    }

    public static int SumCol(ArrayList<ArrayList<Integer>> arr){
        int sum = 0;
        for (int l = 0; l < arr.get(0).size(); l++){
            sum += arr.get(l).get(0);
        }
        for (int i = 1; i < arr.size(); i++){
            int sum_new = 0;
            for (int l = 0; l < arr.get(i).size(); l++){
                sum_new += arr.get(l).get(i);
            }
            if (sum_new != sum)
                return -1;
        }
        return sum;
    }

    public static boolean square(ArrayList<ArrayList<Integer>> arr){
        if(arr.size() == 1 && arr.get(0).size() == 1)
            return false;
        int size = arr.get(0).size();
        for (int i = 0; i < arr.size();i++ ){
            if (size == arr.get(i).size() && size == arr.size())
                size = arr.get(i).size();
            else{
                return false;
            }
        }
        return true;
    }
}
