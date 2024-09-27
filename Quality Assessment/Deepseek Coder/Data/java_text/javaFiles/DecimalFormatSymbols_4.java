import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_4 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('-');
        System.out.println(symbols.getGroupingSeparator());
    }
}
