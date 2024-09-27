import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class XMLGregorianCalendar_5 {
    public static void main(String[] args) throws Exception {
        // Creating an XMLGregorianCalendar instance
        DatatypeFactory dataTypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar xmlCalendar = dataTypeFactory.newXMLGregorianCalendar(new GregorianCalendar());

        // Setting the timezone offset to UTC+2
        xmlCalendar.setTimezone(2 * 60); // 2 hours * 60 minutes

        // Displaying the date with the new timezone offset
        System.out.println("Original Date: " + xmlCalendar.toString());
    }
}
