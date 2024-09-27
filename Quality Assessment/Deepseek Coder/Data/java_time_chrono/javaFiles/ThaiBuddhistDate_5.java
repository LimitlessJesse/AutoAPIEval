import java.time.chrono.ThaiBuddhistDate;

public class ThaiBuddhistDate_5 {
    public static void main(String[] args) {
        ThaiBuddhistDate date = ThaiBuddhistDate.now();
        int lengthOfMonth = date.lengthOfMonth();
        System.out.println("Length of the month: " + lengthOfMonth);
    }
}
