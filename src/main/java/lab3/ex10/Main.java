package lab3.ex10;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Дмитрий\\IdeaProjects\\labSem1";

        System.out.println(Arrays.toString(getSubdirectoriesInnerClass(path)));
        System.out.println(Arrays.toString(getSubdirectoriesLambda(path)));
    }


    private static File[] getSubdirectoriesInnerClass(String path) {
        File[] dirs = new File(path).listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        });
        return dirs == null ? new File[0] : dirs;
    }

    private static File[] getSubdirectoriesLambda(String path) {
        File[] dirs = new File(path).listFiles(f -> f.isDirectory());
        return dirs == null ? new File[0] : dirs;
    }
}
