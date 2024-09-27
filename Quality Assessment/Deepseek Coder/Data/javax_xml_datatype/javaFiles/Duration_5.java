import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_5 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration = datatypeFactory.newDuration("P1DT10H");
            System.out.println(duration.getMinutes());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
