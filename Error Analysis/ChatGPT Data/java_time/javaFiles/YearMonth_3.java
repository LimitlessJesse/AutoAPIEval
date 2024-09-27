import java.time.YearMonth;

public class YearMonth_3 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.now();
        int monthValue = yearMonth.getMonthValue();
        System.out.println("Current month: " + monthValue);
    }
}
