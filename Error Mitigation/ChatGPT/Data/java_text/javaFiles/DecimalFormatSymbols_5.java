import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_5 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char percent = symbols.getPercent();
        System.out.println("Percent sign: " + percent);
    }
}
