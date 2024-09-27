import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_4 {
    public static void main(String[] args) {
        try {
            Duration duration = DatatypeFactory.newInstance().newDuration("PT1H30M");
            int minutes = duration.getMinutes();
            System.out.println("Minutes: " + minutes);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
