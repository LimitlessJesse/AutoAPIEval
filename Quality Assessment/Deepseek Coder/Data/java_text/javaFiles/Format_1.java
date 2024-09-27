import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Format_1 {
    public static void main(String[] args) {
        Format formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String strDate = formatter.format(new Date());
        System.out.println(strDate);
    }
}
