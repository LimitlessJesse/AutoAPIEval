import java.time.YearMonth;

public class YearMonth_4 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.now();
        int year = yearMonth.getYear();
        System.out.println("Current year: " + year);
    }
}
