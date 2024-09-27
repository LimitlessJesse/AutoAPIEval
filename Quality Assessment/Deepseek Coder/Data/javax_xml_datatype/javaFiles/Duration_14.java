import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_14 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration = datatypeFactory.newDuration("P2Y10M15DT10H20M30S");
            System.out.println(duration.toString());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
