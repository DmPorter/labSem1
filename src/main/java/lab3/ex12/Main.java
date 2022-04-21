package lab3.ex12;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String DIR = "C:\\Users\\Дмитрий\\IdeaProjects\\labSem1";
        File[] files = new File(DIR).listFiles();
        sortDir(files);
        System.out.println(Arrays.toString(files));
    }

    private static void sortDir(File[] files) {
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getPath));
    }


}
