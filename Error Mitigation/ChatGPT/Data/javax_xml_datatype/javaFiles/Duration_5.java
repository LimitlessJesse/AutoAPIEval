import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_5 {
    public static void main(String[] args) {
        try {
            Duration duration = DatatypeFactory.newInstance().newDuration("P1Y2M3DT10H30M");
            int seconds = duration.getSeconds();
            System.out.println("Seconds: " + seconds);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
