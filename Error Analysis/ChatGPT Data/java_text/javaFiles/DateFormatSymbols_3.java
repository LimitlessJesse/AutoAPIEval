import java.text.DateFormatSymbols;

public class DateFormatSymbols_3 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] shortMonths = symbols.getShortMonths();
        
        for(String month : shortMonths) {
            System.out.println(month);
        }
    }
}
