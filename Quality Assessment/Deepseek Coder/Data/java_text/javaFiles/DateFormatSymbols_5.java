import java.text.DateFormatSymbols;
import java.util.Arrays;

public class DateFormatSymbols_5 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] amPmStrings = dfs.getAmPmStrings();
        System.out.println(Arrays.toString(amPmStrings));
    }
}
