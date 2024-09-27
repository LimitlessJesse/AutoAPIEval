import java.time.LocalDate;

public class LocalDate_18 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Original Date: " + date);

        LocalDate newDate = date.withMonth(12);
        System.out.println("New Date with Month 12: " + newDate);
    }
}
