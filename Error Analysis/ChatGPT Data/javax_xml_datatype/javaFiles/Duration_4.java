import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_4 {
    public static void main(String[] args) throws DatatypeConfigurationException {
        DatatypeFactory factory = DatatypeFactory.newInstance();
        
        Duration duration1 = factory.newDuration(true, 0, 1, 0, 0, 0, 0);
        Duration duration2 = factory.newDuration(true, 0, 2, 0, 0, 0, 0);
        
        boolean isShorter = duration1.isShorterThan(duration2);
        System.out.println("Is duration1 shorter than duration2? " + isShorter);
    }
}
