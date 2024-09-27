import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class XMLGregorianCalendar_4 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(new GregorianCalendar(2000, 2, 4, 23, 0, 0));
            XMLGregorianCalendar normalized = xmlGregorianCalendar.normalize();
            System.out.println("Original: " + xmlGregorianCalendar);
            System.out.println("Normalized to UTC: " + normalized);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
