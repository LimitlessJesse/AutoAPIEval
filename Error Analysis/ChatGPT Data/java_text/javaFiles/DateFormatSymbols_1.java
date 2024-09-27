import java.text.DateFormatSymbols;

public class DateFormatSymbols_1 {
    public static void main(String[] args) {
        DateFormatSymbols symbols = new DateFormatSymbols();
        String[] months = symbols.getMonths();
        
        for(String month : months){
            System.out.println(month);
        }
    }
}
