import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeConstants;

public class XMLGregorianCalendar_5 {
    public static void main(String[] args) {
        XMLGregorianCalendar calendar = null; // Initialize XMLGregorianCalendar object
        
        // Set the timezone offset to 120 minutes
        calendar.setTimezone(120);
        
        // Unset the timezone field
        calendar.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
    }
}
