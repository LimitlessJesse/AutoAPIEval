import java.time.MonthDay;

public class MonthDay_3 {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        int year = 2022;
        boolean isValid = monthDay.isValidYear(year);
        System.out.println("Is year " + year + " valid for month-day " + monthDay + "? " + isValid);
    }
}
