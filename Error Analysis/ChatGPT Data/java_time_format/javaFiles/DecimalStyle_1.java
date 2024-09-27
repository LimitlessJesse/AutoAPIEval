import java.time.format.DecimalStyle;

public class DecimalStyle_1 {
    public static void main(String[] args) {
        DecimalStyle decimalStyle = DecimalStyle.STANDARD;
        char decimalSeparator = decimalStyle.getDecimalSeparator();
        System.out.println("Decimal Separator: " + decimalSeparator);
    }
}
