import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_4 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char patternSeparator = symbols.getPatternSeparator();
        System.out.println("Pattern Separator: " + patternSeparator);
    }
}
