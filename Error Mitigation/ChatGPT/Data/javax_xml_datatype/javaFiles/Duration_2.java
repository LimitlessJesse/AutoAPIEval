import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_2 {
    public static void main(String[] args) {
        try {
            Duration duration = DatatypeFactory.newInstance().newDuration("P1Y2M3DT4H5M6S");
            int days = duration.getDays();
            System.out.println("Days: " + days);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
