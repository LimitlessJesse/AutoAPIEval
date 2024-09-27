import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_13 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration = datatypeFactory.newDuration("P2Y10M10DT10H10M10S");
            int hashCode = duration.hashCode();
            System.out.println("Hash code of the Duration object: " + hashCode);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
