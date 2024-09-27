import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParsePosition_1 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date date = format.parse("30-02-2020", pos);

        System.out.println(date);
        System.out.println(pos.getErrorIndex());
    }
}
