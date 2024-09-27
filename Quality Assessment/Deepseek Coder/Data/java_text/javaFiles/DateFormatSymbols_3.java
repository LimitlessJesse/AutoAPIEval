import java.text.DateFormatSymbols;
import java.util.Arrays;

public class DateFormatSymbols_3 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] weekdays = dfs.getShortWeekdays();
        System.out.println(Arrays.toString(weekdays));
    }
}
