import java.time.LocalDate;

public class LocalDate_29 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 1, 15);
        System.out.println("Original date: " + date);

        LocalDate newDate = date.withMonth(12);
        System.out.println("Date with changed month: " + newDate);
    }
}
