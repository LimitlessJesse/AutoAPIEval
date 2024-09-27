import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DatatypeFactory_5 {
    public static void main(String[] args) {
        XMLGregorianCalendar xmlGregorianCalendar = newXMLGregorianCalendarTime(10, 30, 45, 0);
        System.out.println("Time: " + xmlGregorianCalendar.getHour() + ":" + xmlGregorianCalendar.getMinute() + ":" + xmlGregorianCalendar.getSecond());
    }
    
    public static XMLGregorianCalendar newXMLGregorianCalendarTime(int hours, int minutes, int seconds, int timezone) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendarTime(hours, minutes, seconds, timezone);
            return xmlGregorianCalendar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
