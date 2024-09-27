import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateFormatter_1 {
    public static void main(String[] args) {
        DateFormatter dateFormatter = new DateFormatter();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormatter.setFormat(dateFormat);
    }
}
