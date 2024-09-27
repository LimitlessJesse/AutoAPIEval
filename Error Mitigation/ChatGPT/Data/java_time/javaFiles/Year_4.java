import java.time.Year;

public class Year_4 {
    public static void main(String[] args) {
        Year year = Year.of(2007);
        Year newYear = year.plusYears(5);
        System.out.println("Original year: " + year);
        System.out.println("Year after adding 5 years: " + newYear);
    }
}
