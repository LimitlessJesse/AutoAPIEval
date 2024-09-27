import java.text.DateFormatSymbols;

public class DateFormatSymbols_4 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] shortWeekdays = symbols.getShortWeekdays();
        
        for (String weekday : shortWeekdays) {
            System.out.println(weekday);
        }
    }
}
