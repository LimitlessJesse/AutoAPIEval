import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DatatypeFactory_3 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar calendar = datatypeFactory.newXMLGregorianCalendar();
            System.out.println(calendar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
