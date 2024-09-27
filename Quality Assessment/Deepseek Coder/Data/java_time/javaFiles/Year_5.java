import java.time.Year;

public class Year_5 {
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println("Current Year: " + year);

        Year previousYear = year.minusYears(1);
        System.out.println("Previous Year: " + previousYear);
    }
}
