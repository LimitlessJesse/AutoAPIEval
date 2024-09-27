import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_3 {
    public static void main(String[] args) {
        try {
            Duration duration = DatatypeFactory.newInstance().newDuration("P1Y2M3DT4H5M6S");
            int hours = duration.getHours();
            System.out.println("Hours: " + hours);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
