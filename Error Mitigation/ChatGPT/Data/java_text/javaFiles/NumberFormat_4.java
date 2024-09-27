import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_4 {
    public static void main(String[] args) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        double number = 0.75;
        String formattedPercent = percentInstance.format(number);
        System.out.println(formattedPercent);
    }
}
