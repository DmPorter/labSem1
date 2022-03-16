package lab2.n1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 3, 1);
        int monthValue = date.getMonthValue();
        for (int i = 1; i < date.getDayOfWeek().getValue() + 1; i++) {
            System.out.print("   ");
        }
        while (date.getMonthValue() == monthValue) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == 6) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }


}

