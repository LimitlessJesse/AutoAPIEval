import java.text.DateFormatSymbols;

public class DateFormatSymbols_4 {
    public static void main(String[] args) {
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] shortWeekdays = dfs.getShortWeekdays();
        
        for(int i=1; i<shortWeekdays.length; i++){
            System.out.println("Short weekday " + i + ": " + shortWeekdays[i]);
        }
    }
}
