import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_1 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
