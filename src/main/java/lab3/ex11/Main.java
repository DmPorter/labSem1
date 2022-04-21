package lab3.ex11;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String DIR = "C:\\Users\\Дмитрий\\IdeaProjects\\labSem1";
        System.out.println(Arrays.toString(withExtension(DIR, "xml")));
        System.out.println(Arrays.toString(withFileFilter(DIR, "txt")));
    }

    public static String[] withExtension(String path, String extension) {
        return new File(path).list((dir, name) -> name.endsWith(extension));
    }

    public static String[] withFileFilter(String path, String extension) {
        return new File(path).list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extension);
            }
        });
    }
}
