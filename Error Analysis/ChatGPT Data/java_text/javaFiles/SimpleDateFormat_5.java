import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_5 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String pattern = sdf.toPattern();
        System.out.println("Pattern: " + pattern);
    }
}
