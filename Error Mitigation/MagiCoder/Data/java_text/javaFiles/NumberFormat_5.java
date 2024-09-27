import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormat_5 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        try {
            Number num = nf.parse("123.45");
            System.out.println(num);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
