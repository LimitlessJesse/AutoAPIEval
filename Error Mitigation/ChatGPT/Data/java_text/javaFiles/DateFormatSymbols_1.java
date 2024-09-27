import java.text.DateFormatSymbols;

public class DateFormatSymbols_1 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        
        for (String month : months) {
            System.out.println(month);
        }
    }
}
