import java.time.LocalDate;

public class LocalDate_11 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        LocalDate newDate = date.plusWeeks(2);
        System.out.println("Date after adding 2 weeks: " + newDate);
    }
}
