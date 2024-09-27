import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class XMLGregorianCalendar_1 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            int year = xmlGregorianCalendar.getYear();
            System.out.println("Year: " + year);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
