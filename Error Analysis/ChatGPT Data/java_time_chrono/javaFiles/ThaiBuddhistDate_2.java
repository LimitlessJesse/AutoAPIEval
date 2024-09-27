import java.time.chrono.ThaiBuddhistDate;

public class ThaiBuddhistDate_2 {
    public static void main(String[] args) {
        ThaiBuddhistDate date = ThaiBuddhistDate.now();
        int length = date.lengthOfMonth();
        System.out.println("Length of the month: " + length);
    }
}
