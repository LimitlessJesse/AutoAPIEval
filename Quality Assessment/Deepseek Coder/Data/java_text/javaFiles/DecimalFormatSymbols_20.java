import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_20 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setNaN("Not a Number");
        System.out.println(symbols.getNaN());
    }
}
