import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_4 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration = datatypeFactory.newDuration("P2DT3H");
            int hours = duration.getHours();
            System.out.println("Hours: " + hours);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
