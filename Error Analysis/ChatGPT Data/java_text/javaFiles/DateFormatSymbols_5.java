import java.text.DateFormatSymbols;

public class DateFormatSymbols_5 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] amPmStrings = symbols.getAmPmStrings();
        
        System.out.println("AM String: " + amPmStrings[0]);
        System.out.println("PM String: " + amPmStrings[1]);
    }
}
