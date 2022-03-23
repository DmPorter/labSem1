package lab2.dop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the month");
        int month = Cal.inputMonth();
        System.out.println("Enter the year");
        int year = Cal.inputYear();
        System.out.println("Enter the day of the week from which the week will start. " +
                            "You can enter a word or a number from 1 to 7");
        int dayOfWeek = Cal.inputDayOfWeek();



        Cal.show(month, year, dayOfWeek);
    }
}
