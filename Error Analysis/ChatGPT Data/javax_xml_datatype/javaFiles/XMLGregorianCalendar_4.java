import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendar_4 {
    public static void main(String[] args) {
        try {
            XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar();
            String xmlFormat = xmlGregCal.toXMLFormat();
            System.out.println("XML Format: " + xmlFormat);
        } catch (DatatypeConfigurationException ex) {
            System.err.println("Error creating XMLGregorianCalendar: " + ex.getMessage());
        }
    }
}
