import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormat_2 {
    public static void main(String[] args) {
        DateFormat dateFormat = DateFormat.getDateInstance();
        String dateString = "2022-01-01";

        try {
            Date date = dateFormat.parse(dateString);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
