import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendar_7 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar calendar = datatypeFactory.newXMLGregorianCalendar();
            System.out.println(calendar.getMillisecond());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
