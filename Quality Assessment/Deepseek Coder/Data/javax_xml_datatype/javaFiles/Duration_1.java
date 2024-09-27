import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_1 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration = datatypeFactory.newDuration("P2Y10M5DT10H30M");
            System.out.println(duration.getYears());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
