import java.time.YearMonth;

public class YearMonth_5 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2022, 9);
        YearMonth newYearMonth = yearMonth.minusMonths(3);
        System.out.println("Original YearMonth: " + yearMonth);
        System.out.println("YearMonth after subtracting 3 months: " + newYearMonth);
    }
}
