package lab3.ex12;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String DIR = "C:\\Users\\Дмитрий\\IdeaProjects\\labSem1";
        File[] files = new File(DIR).listFiles();
        sortDirWithLambda(files);
        System.out.println(Arrays.toString(files));
    }

    private static void sortDirWithLambda(File[] files) {
        Arrays.sort(files, (a, b) -> {
            if(a.isFile() && b.isFile())
                if(a.compareTo(b) > 0){
                    return 1;
                }else if(a.compareTo(b) < 0) {
                    return -1;
                }else return 0;
            else if(a.isFile())
                return 1;
            else return -1;
        });
    }


}
