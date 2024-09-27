import java.time.LocalDate;

public class LocalDate_15 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int lengthOfYear = today.lengthOfYear();
        System.out.println("Length of the year: " + lengthOfYear);
    }
}
