import javax.xml.datatype.*;

public class DatatypeFactory_9 {
    public static void main(String[] args) throws DatatypeConfigurationException {
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar xmlGregorianCalendar = datatypeFactory.newXMLGregorianCalendar(2022, 12, 31, 23, 59, 59, 999, CalendarType.GREGORIAN);
        System.out.println(xmlGregorianCalendar.toString());
    }
}
