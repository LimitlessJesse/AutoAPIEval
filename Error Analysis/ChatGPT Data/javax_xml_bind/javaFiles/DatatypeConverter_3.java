import javax.xml.bind.DatatypeConverter;
import java.util.Calendar;

public class DatatypeConverter_3 {
    public static void main(String[] args) {
        String lexicalXSDDate = "2022-10-15T12:00:00Z";
        Calendar calendar = DatatypeConverter.parseDate(lexicalXSDDate);
        System.out.println(calendar.getTime());
    }
}
