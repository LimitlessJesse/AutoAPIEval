import java.time.YearMonth;

public class YearMonth_1 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2022, 1);
        int length = yearMonth.lengthOfMonth();
        System.out.println("Length of the month: " + length);
    }
}
