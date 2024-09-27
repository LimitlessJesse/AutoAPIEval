import java.time.LocalDate;

public class LocalDate_5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2009, 1, 1);
        LocalDate newDate = date.minusDays(1);
        System.out.println("Original date: " + date);
        System.out.println("Date after subtracting one day: " + newDate);
    }
}
