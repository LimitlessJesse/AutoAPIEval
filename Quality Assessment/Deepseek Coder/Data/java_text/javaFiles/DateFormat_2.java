import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormat_2 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getInstance();
        String dateString = "12/08/2022";

        try {
            Date parsedDate = dateFormat.parse(dateString);
            System.out.println(parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
