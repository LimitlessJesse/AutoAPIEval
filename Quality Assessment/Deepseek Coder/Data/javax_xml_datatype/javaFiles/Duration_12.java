import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_12 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration1 = datatypeFactory.newDuration("P2Y10M10DT10H10M10S");
            Duration duration2 = datatypeFactory.newDuration("P2Y10M10DT10H10M10S");

            boolean isEqual = duration1.equals(duration2);
            System.out.println("Are the two durations equal? " + isEqual);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
