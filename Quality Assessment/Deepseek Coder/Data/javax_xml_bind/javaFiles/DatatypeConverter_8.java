import javax.xml.bind.DatatypeConverter;
import java.util.Date;

public class DatatypeConverter_8 {
    public static void main(String[] args) {
        String lexicalXSDDate = "2022-01-01T10:20:30Z";
        Date date = DatatypeConverter.parseDate(lexicalXSDDate);
        System.out.println(date);
    }
}
