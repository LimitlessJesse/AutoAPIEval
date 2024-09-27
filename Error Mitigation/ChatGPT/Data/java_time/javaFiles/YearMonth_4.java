import java.time.YearMonth;

public class YearMonth_4 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2022, 9);
        YearMonth newYearMonth = yearMonth.plusMonths(3);
        System.out.println("Original YearMonth: " + yearMonth);
        System.out.println("YearMonth after adding 3 months: " + newYearMonth);
    }
}
