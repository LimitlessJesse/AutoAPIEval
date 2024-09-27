import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_1 {
    public static void main(String[] args) {
        String dateStr = "2021-10-15";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date date = dateFormat.parse(dateStr);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parsing date");
        }
    }
}
