import java.time.LocalDate;

public class LocalDate_18 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, 1, 1);
        long epochDay = date.toEpochDay();
        System.out.println("Epoch Day: " + epochDay);
    }
}
