import javax.xml.bind.DatatypeConverter;
import java.util.Calendar;

public class DatatypeConverter_4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String dateString = DatatypeConverter.printDate(calendar);
        System.out.println("Formatted Date: " + dateString);
    }
}
