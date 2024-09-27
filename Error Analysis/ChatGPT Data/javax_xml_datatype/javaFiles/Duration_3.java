import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.DatatypeConfigurationException;

public class Duration_3 {
    public static void main(String[] args) {
        try {
            DatatypeFactory factory = DatatypeFactory.newInstance();
            Duration duration1 = factory.newDuration(true, 0, 0, 0, 5, 30, 15);
            Duration duration2 = factory.newDuration(true, 0, 0, 0, 10, 15, 45);
            boolean isLonger = duration2.isLongerThan(duration1);
            System.out.println("duration2 is longer than duration1: " + isLonger);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
