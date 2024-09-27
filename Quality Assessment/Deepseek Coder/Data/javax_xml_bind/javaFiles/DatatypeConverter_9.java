import javax.xml.bind.DatatypeConverter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatatypeConverter_9 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        System.out.println(printTime(cal));
    }

    public static String printTime(Calendar cal) {
        return DatatypeConverter.printTime(cal);
    }
}
