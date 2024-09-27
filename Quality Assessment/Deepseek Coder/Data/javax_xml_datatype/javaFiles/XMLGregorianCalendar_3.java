import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class XMLGregorianCalendar_3 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            int day = xmlGregorianCalendar.getDay();
            System.out.println("Day of the month: " + day);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
