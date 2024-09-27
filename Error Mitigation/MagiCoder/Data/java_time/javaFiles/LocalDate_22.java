import java.time.LocalDate;

public class LocalDate_22 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 12, 31);
        System.out.println("Original date: " + date);

        LocalDate newDate = date.withYear(2023);
        System.out.println("Date with new year: " + newDate);
    }
}
