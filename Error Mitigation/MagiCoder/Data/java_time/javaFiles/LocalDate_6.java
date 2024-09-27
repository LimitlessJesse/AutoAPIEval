import java.time.LocalDate;

public class LocalDate_6 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 1, 1);
        int dayOfYear = date.getDayOfYear();
        System.out.println("Day of year: " + dayOfYear);
    }
}
