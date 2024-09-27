import java.util.Date;

public class Date_1 {
    public static void main(String[] args) {
        Date date = new Date();
        long milliseconds = date.getTime();
        System.out.println("Number of milliseconds since January 1, 1970: " + milliseconds);
    }
}
