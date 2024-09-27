import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendar_2 {
    public static void main(String[] args) {
        XMLGregorianCalendar calendar = null; // Initialize XMLGregorianCalendar object
        int month = calendar.getMonth();
        if (month != DatatypeConstants.FIELD_UNDEFINED) {
            System.out.println("Month: " + month);
        } else {
            System.out.println("Month is undefined");
        }
    }
}
