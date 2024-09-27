import javax.swing.text.InternationalFormatter;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InternationalFormatter_5 {
    public static void main(String[] args) {
        InternationalFormatter formatter = new InternationalFormatter();
        Format format = new SimpleDateFormat("yyyy-MM-dd");
        formatter.setFormat(format);

        Date date = new Date();
        String formattedDate = formatter.valueToString(date);
        System.out.println(formattedDate);
    }
}
