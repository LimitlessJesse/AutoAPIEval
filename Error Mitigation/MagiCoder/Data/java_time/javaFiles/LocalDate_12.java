import java.time.LocalDate;

public class LocalDate_12 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        LocalDate dateMinusOneWeek = date.minusWeeks(1);
        System.out.println("Date minus one week: " + dateMinusOneWeek);
    }
}
