import java.sql.Date;

public class Date_2 {
    public static void main(String[] args) {
        Date date = new Date(0);
        System.out.println("Before setTime: " + date);
        
        date.setTime(1000000000);
        System.out.println("After setTime: " + date);
    }
}
