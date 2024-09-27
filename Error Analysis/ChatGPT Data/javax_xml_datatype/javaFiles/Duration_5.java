import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_5 {
    public static void main(String[] args) throws DatatypeConfigurationException {
        Duration duration = DatatypeFactory.newInstance().newDuration("P2Y3M5DT12H30M");
        
        Duration multipliedDuration = duration.multiply(2);
        
        System.out.println("Original Duration: " + duration.toString());
        System.out.println("Multiplied Duration by 2: " + multipliedDuration.toString());
    }
}
