import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_18 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setInfinity("Inf");
        System.out.println(symbols.getInfinity());
    }
}
