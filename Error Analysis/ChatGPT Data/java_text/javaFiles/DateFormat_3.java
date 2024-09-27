import java.text.DateFormat;
import java.util.Date;

public class DateFormat_3 {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getTimeInstance(DateFormat.SHORT);
        String time = df.format(new Date());
        System.out.println(time);
    }
}
