import javax.xml.datatype.*;
import java.util.GregorianCalendar;

public class XMLGregorianCalendar_1 {
    public static void main(String[] args) {
        XMLGregorianCalendar cal = null;
        
        // Create a new XMLGregorianCalendar object
        try {
            cal = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        // Normalize the XMLGregorianCalendar object
        cal = cal.normalize();

        System.out.println("Normalized DateTime: " + cal.toString());
    }
}
