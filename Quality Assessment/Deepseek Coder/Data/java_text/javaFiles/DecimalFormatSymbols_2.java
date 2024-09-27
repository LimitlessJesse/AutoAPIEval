import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_2 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char groupingSeparator = symbols.getGroupingSeparator();
        System.out.println("The grouping separator is: " + String.valueOf(groupingSeparator));
    }
}
