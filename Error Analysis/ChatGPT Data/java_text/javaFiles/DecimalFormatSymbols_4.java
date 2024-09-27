import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_4 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char minusSign = symbols.getMinusSign();
        System.out.println("Minus sign: " + minusSign);
    }
}
