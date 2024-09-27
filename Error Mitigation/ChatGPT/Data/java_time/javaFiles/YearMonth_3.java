import java.time.YearMonth;

public class YearMonth_3 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2022, 9);
        YearMonth newYearMonth = yearMonth.minusYears(2);
        System.out.println("Original YearMonth: " + yearMonth);
        System.out.println("YearMonth after subtracting 2 years: " + newYearMonth);
    }
}
