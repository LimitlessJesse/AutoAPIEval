import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyLocalizedPattern("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }
}
