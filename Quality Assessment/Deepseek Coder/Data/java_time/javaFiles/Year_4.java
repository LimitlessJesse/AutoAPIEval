import java.time.Year;

public class Year_4 {
    public static void main(String[] args) {
        Year year = Year.now(); // get the current year
        System.out.println("Current Year: " + year);

        Year nextYear = year.plusYears(1); // add 1 year to the current year
        System.out.println("Next Year: " + nextYear);
    }
}
