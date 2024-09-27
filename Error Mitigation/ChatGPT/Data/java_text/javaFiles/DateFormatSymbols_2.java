import java.text.DateFormatSymbols;

public class DateFormatSymbols_2 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] shortMonths = dfs.getShortMonths();
        
        for(String month : shortMonths) {
            System.out.println(month);
        }
    }
}
