import java.time.YearMonth;

public class YearMonth_5 {
    public static void main(String[] args) {
        YearMonth current = YearMonth.now();
        YearMonth another = YearMonth.of(2021, 10);
        
        boolean isAfter = current.isAfter(another);
        System.out.println("Is current YearMonth after another YearMonth? " + isAfter);
    }
}
