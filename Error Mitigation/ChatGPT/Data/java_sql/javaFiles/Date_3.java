import java.sql.Date;

public class Date_3 {
    public static void main(String[] args) {
        String dateString = "2022-12-31";
        Date date = Date.valueOf(dateString);
        System.out.println("Date: " + date);
    }
}
