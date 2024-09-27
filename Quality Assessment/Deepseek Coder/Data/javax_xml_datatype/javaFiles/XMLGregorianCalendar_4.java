import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XMLGregorianCalendar_4 {
    public static void main(String[] args) {
        try {
            DatatypeFactory df = DatatypeFactory.newInstance();
            XMLGregorianCalendar cal = df.newXMLGregorianCalendar();
            cal.setHour(15);
            System.out.println("Hour: " + cal.getHour());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
