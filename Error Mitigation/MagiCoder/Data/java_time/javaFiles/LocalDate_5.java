import java.time.LocalDate;

public class LocalDate_5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int dayOfMonth = date.getDayOfMonth();
        System.out.println("The day of the month is: " + dayOfMonth);
    }
}
