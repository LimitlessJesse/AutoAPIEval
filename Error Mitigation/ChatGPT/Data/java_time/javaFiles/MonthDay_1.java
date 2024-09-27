import java.time.MonthDay;

public class MonthDay_1 {
    public static void main(String[] args) {
        MonthDay monthDay = MonthDay.of(12, 3);
        int monthValue = monthDay.getMonthValue();
        System.out.println("Month value: " + monthValue);
    }
}
