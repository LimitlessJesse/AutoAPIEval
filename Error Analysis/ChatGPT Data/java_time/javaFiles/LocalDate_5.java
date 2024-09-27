import java.time.LocalDate;

public class LocalDate_5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate newDate = date.withYear(2022);
        System.out.println("Original Date: " + date);
        System.out.println("New Date with Year 2022: " + newDate);
    }
}
