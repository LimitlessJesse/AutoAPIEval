import java.time.chrono.HijrahDate;

public class HijrahDate_20 {
    public static void main(String[] args) {
        HijrahDate date = HijrahDate.now();
        int hashCode = date.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
