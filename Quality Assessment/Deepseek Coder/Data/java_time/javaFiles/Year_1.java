import java.time.Year;

public class Year_1 {
    public static void main(String[] args) {
        Year year = Year.now();
        int value = year.getValue();
        System.out.println("The value of the year is: " + value);
    }
}
