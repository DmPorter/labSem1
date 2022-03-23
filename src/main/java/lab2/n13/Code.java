package lab2.n13;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class Code {
    private static final String PATH = "src\\main\\resources\\numbers.csv";

    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReader(new FileReader(PATH));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            for (String e : nextLine) {
                System.out.format("%s ", e);
            }
            System.out.println();
        }
    }

}
