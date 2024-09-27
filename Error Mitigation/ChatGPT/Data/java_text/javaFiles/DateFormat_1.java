import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_1 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String formattedDate = dateFormat.format(date);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
