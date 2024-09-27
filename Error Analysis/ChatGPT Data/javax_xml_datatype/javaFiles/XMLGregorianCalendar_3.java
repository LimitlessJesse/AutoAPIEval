import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendar_3 {
    public static void main(String[] args) {
        try {
            // Creating an XMLGregorianCalendar object
            XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar("2022-12-25");

            // Checking if the XMLGregorianCalendar object is valid
            boolean isValid = xmlDate.isValid();
            System.out.println("Is the XMLGregorianCalendar object valid? " + isValid);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
