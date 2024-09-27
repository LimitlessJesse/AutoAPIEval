import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_6 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setPerMill('‰');
        System.out.println(symbols.getPerMill());
    }
}
