import javax.xml.bind.DatatypeConverter;
import java.util.Calendar;

public class DatatypeConverter_2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String dateTimeString = DatatypeConverter.printDateTime(calendar);
        System.out.println(dateTimeString);
    }
}
