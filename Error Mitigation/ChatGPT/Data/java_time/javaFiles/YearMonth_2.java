import java.time.YearMonth;

public class YearMonth_2 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2022, 9);
        YearMonth newYearMonth = yearMonth.plusYears(5);
        
        System.out.println("Original YearMonth: " + yearMonth);
        System.out.println("YearMonth after adding 5 years: " + newYearMonth);
    }
}
