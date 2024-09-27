import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.DatatypeConfigurationException;

public class DatatypeFactory_2 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            String lexicalRepresentation = "P1Y2M3DT4H5M6S";
            Duration duration = datatypeFactory.newDuration(lexicalRepresentation);
            System.out.println("Duration: " + duration.toString());
        } catch (DatatypeConfigurationException e) {
            System.out.println("Error creating DatatypeFactory");
            e.printStackTrace();
        }
    }
}
