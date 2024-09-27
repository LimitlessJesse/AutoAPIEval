import java.time.MonthDay;

public class MonthDay_3 {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(2, 12);
        int monthValue = monthDay.getMonthValue();
        System.out.println("Month value: " + monthValue);
    }
}
