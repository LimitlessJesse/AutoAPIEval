import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_3 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration = datatypeFactory.newDuration("P2DT3H4M");
            System.out.println(duration.getDays());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
