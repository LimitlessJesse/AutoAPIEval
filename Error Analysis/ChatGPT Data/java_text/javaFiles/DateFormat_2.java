import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_2 {
    public static void main(String[] args) {
        String source = "2022-01-01";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date date = df.parse(source);
            System.out.println("Parsed date: " + date);
        } catch (ParseException e) {
            System.out.println("Parse Exception: " + e.getMessage());
        }
    }
}
