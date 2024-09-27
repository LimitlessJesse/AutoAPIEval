import java.text.FieldPosition;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_4 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        FieldPosition position = new FieldPosition(1);
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        formatter.format(date, buffer, position);
        System.out.println(buffer.toString());
    }
}
