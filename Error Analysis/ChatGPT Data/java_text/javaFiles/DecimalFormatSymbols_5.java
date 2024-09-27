import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_5 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        System.out.println("Default decimal separator: " + symbols.getDecimalSeparator());
        
        symbols.setDecimalSeparator(',');
        System.out.println("New decimal separator: " + symbols.getDecimalSeparator());
    }
}
