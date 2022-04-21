package lab2.dop1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.of(LocalDate.now().getYear(),
                        LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
        System.out.println(now);
        int day = now.getYear();
        LocalDate NextDay = now.plusDays(1);
    }
}
