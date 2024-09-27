import java.time.LocalDate;

public class LocalDate_4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2008, 12, 31);
        LocalDate newDate = date.plusDays(1);
        System.out.println("Original date: " + date);
        System.out.println("Date after adding 1 day: " + newDate);
    }
}
