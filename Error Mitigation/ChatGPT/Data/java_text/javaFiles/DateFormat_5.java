import java.text.DateFormat;
import java.util.Date;

public class DateFormat_5 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getInstance();
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Formatted Date: " + formattedDate);
    }
}
