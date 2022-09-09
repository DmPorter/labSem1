package lab4.dop2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyClassLoader extends ClassLoader{
    private final String PATH = "C:\\Users\\dmitr\\IdeaProjects\\labSem1\\comp";

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        File dir = new File(PATH);
        List<File> lFile = new ArrayList<>();
        for(var values : Objects.requireNonNull(dir.listFiles())){
            if(values.isFile() && values.getName().equals(name + ".class"))
                lFile.add(values);
            else if(!values.isFile())
                lFile.addAll(Arrays.asList(Objects.requireNonNull(values.listFiles((a) -> a.getName().equals(name + ".class")))));
        }

        if(lFile.isEmpty())
            throw new ClassNotFoundException();

        try {
            InputStream ins = new BufferedInputStream(new FileInputStream(lFile.get(0)));
            var f = lFile.get(0).length();
            byte[] bytes = new byte[(int)f];

            ins.read(bytes);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
