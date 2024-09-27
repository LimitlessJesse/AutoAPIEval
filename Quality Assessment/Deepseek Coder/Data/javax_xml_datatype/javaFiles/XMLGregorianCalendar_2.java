import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendar_2 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar calendar = datatypeFactory.newXMLGregorianCalendar("2022-01-01");
            int month = calendar.getMonth();
            System.out.println("Month: " + month);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
