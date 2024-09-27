import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class DatatypeFactory_4 {
    public static void main(String[] args) {
        XMLGregorianCalendar xmlGregorianCalendar = newXMLGregorianCalendarDate(2022, 10, 20, 0);
        System.out.println(xmlGregorianCalendar);
    }

    public static XMLGregorianCalendar newXMLGregorianCalendarDate(int year, int month, int day, int timezone) {
        try {
            DatatypeFactory df = DatatypeFactory.newInstance();
            XMLGregorianCalendar xmlGregorianCalendar = df.newXMLGregorianCalendar();
            xmlGregorianCalendar.setYear(year);
            xmlGregorianCalendar.setMonth(month);
            xmlGregorianCalendar.setDay(day);
            xmlGregorianCalendar.setTimezone(timezone);
            return xmlGregorianCalendar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
