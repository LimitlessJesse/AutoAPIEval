import java.text.DateFormatSymbols;
import java.util.Arrays;

public class DateFormatSymbols_2 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] shortMonths = dfs.getShortMonths();
        System.out.println(Arrays.toString(shortMonths));
    }
}
