import java.time.LocalDate;

public class LocalDate_17 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 1, 1);
        System.out.println("Original date: " + date);

        LocalDate newDate = date.withYear(2022);
        System.out.println("New date with year 2022: " + newDate);
    }
}
