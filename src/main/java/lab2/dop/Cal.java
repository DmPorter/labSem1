package lab2.dop;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;
import static java.time.DayOfWeek.of;

public class Cal {

    public static int inputMonth(){
        int month = Cal.inputValue(1, 12);
        while (month == -1){
            System.out.println("Not ok");
            month = Cal.inputValue(1, 12);
        }
        return month;
    }

    public static int inputYear() {
        int year = Cal.inputValue(0, 2022);
        while (year == -1){
            System.out.println("Not ok");
            year = Cal.inputValue(0, 2022);
        }
        return year;
    }

    public static int inputDayOfWeek(){
        Scanner sc = new Scanner(System.in);
        int value = -1;
        while (value == -1) {
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value >= 1 && value <= 7) {
                    return value;
                } else {
                    value = -1;
                }
            } else if (sc.hasNextLine()) {
                switch (sc.nextLine().toLowerCase(Locale.ROOT)) {
                    case "monday":
                        return 1;
                    case "tuesday":
                        return 2;
                    case "wednesday":
                        return 3;
                    case "thursday":
                        return 4;
                    case "friday":
                        return 5;
                    case "saturday":
                        return 6;
                    case "sunday":
                        return 7;
                }
            }
            System.out.println("Not ok");
        }
        return value;
    }

    public static int inputValue(int start, int end){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int value = sc.nextInt();
            if (value >= start && value <= end){
                return value;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
    public static void show(int month, int year, int value){
        LocalDate date = LocalDate.of(year, month, 1);
        int weekValue = (value == 1) ? 7 : value - 1;
        int tabValue = (date.getDayOfWeek().getValue() - value >= 0) ? date.getDayOfWeek().getValue() - value : 7 + date.getDayOfWeek().getValue() - value;
        for (int i = value - 1; i < value + 6; i++) {
            System.out.printf("%4s", of(i % 7 + 1).toString().substring(0, 3));
        }
        out.println();
        for (int i = 0; i < tabValue; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek().getValue() == weekValue) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }
}
