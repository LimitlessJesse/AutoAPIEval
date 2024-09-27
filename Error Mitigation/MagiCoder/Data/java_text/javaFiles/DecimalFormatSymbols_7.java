import java.text.DecimalFormatSymbols;

public class DecimalFormatSymbols_7 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        char perMill = symbols.getPerMill();
        System.out.println("Per mille sign: " + perMill);
    }
}
