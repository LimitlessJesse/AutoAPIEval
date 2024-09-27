import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;

public class XMLGregorianCalendar_5 {
    public static void main(String[] args) {
        XMLGregorianCalendar calendar = new GregorianCalendar();
        int minute = calendar.getMinute();
        System.out.println("Current minute: " + minute);
    }
}
