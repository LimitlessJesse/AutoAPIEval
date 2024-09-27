import java.time.LocalDate;

public class LocalDate_14 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 2, 15); // February 15, 2022
        int lengthOfMonth = date.lengthOfMonth();
        System.out.println("Length of month: " + lengthOfMonth);
    }
}
