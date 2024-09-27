import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class DatatypeFactory_4 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
            System.out.println(xmlGregorianCalendar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
