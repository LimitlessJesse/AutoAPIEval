import java.time.Year;

public class Year_3 {
    public static void main(String[] args) {
        Year year = Year.of(2021);
        Year newYear = year.minusYears(1);
        System.out.println("Previous year: " + newYear);
    }
}
