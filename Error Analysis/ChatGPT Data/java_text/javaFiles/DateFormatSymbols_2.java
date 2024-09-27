import java.text.DateFormatSymbols;

public class DateFormatSymbols_2 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] weekdays = symbols.getWeekdays();
        
        System.out.println("Weekdays:");
        for (String weekday : weekdays) {
            System.out.println(weekday);
        }
    }
}
