import java.time.LocalDate;

public class LocalDate_13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2007, 3, 31);
        LocalDate newDate = date.plusMonths(1);
        System.out.println(newDate);
    }
}
