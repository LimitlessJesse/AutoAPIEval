import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_23 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char percentSign = symbols.getPercent();
        System.out.println("Percent sign: " + percentSign);
    }
}
