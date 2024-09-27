import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_3 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char minusSign = symbols.getMinusSign();
        System.out.println("Minus sign character: " + minusSign);
    }
}
