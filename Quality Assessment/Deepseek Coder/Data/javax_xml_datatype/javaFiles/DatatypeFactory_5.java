import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DatatypeFactory_5 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar("2022-01-01");
            System.out.println(xmlGregorianCalendar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
