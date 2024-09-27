import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormat_4 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        long number = 1234567890;
        String formattedNumber = nf.format(number);
        System.out.println(formattedNumber);
    }
}
