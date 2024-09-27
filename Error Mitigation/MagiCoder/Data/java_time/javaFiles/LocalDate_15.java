import java.time.LocalDate;

public class LocalDate_15 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, 2, 29);
        System.out.println("Original date: " + date);

        LocalDate newDate = date.plusYears(1);
        System.out.println("Date after adding one year: " + newDate);
    }
}
