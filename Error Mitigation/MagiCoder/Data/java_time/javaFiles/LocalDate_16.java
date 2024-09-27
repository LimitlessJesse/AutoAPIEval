import java.time.LocalDate;

public class LocalDate_16 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 1, 1);
        System.out.println("Original date: " + date);

        LocalDate newDate = date.minusYears(2);
        System.out.println("Date after subtracting 2 years: " + newDate);
    }
}
