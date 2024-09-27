import java.text.Format;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_1 {
    public static void main(String[] args) {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String formattedDate = formatter.format(date);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
