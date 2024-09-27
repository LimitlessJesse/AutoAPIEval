import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_5 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char groupingSeparator = symbols.getGroupingSeparator();
        System.out.println("Grouping Separator: " + groupingSeparator);
    }
}
