import java.time.LocalDate;

public class LocalDate_4 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate previousDate = currentDate.minusDays(7);
        
        System.out.println("Current Date: " + currentDate);
        System.out.println("Date 7 days ago: " + previousDate);
    }
}
