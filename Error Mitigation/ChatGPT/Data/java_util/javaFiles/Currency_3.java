import java.util.Currency;

public class Currency_3 {
    public static void main(String[] args) {
        Currency euro = Currency.getInstance("EUR");
        int fractionDigits = euro.getDefaultFractionDigits();
        System.out.println("Default fraction digits for Euro: " + fractionDigits);
        
        Currency yen = Currency.getInstance("JPY");
        fractionDigits = yen.getDefaultFractionDigits();
        System.out.println("Default fraction digits for Japanese Yen: " + fractionDigits);
        
        Currency imf = Currency.getInstance("XDR");
        fractionDigits = imf.getDefaultFractionDigits();
        System.out.println("Default fraction digits for IMF Special Drawing Rights: " + fractionDigits);
    }
}
