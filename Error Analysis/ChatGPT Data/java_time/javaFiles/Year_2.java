import java.time.Year;

public class Year_2 {
    public static void main(String[] args) {
        Year year = Year.of(2021);
        System.out.println(year.isLeap());
    }
}
