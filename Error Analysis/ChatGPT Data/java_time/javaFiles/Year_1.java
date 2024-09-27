import java.time.Year;

public class Year_1 {
    public static void main(String[] args) {
        Year year = Year.of(2021);
        int value = year.getValue();
        System.out.println("Year value: " + value);
    }
}
