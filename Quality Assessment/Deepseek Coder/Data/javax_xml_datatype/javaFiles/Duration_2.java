import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

public class Duration_2 {
    public static void main(String[] args) throws Exception {
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar xgc = datatypeFactory.newXMLGregorianCalendar("2022-01-01T00:00:00");
        XMLGregorianCalendar xgcNow = datatypeFactory.newXMLGregorianCalendar();
        Duration duration = xgc.subtract(xgcNow);
        System.out.println(duration.getMonths());
    }
}
