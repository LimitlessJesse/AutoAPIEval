import java.time.Year;

public class Year_3 {
    public static void main(String[] args) {
        Year year = Year.of(2021);
        Year newYear = year.minusYears(5);
        System.out.println("Original year: " + year);
        System.out.println("Year after subtracting 5 years: " + newYear);
    }
}
