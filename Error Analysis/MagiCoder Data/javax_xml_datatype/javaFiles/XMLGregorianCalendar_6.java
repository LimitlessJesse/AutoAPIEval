import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class XMLGregorianCalendar_6 {
    public static void main(String[] args) {
        try {
            DatatypeFactory df = DatatypeFactory.newInstance();
            GregorianCalendar gc = new GregorianCalendar();
            XMLGregorianCalendar xgc = df.newXMLGregorianCalendar(gc);
            System.out.println(xgc.getYear());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
    }
}
