import java.time.format.DecimalStyle;

public class DecimalStyle_3 {
    public static void main(String[] args) {
        DecimalStyle decimalStyle = DecimalStyle.STANDARD;
        char zeroDigit = decimalStyle.getZeroDigit();
        System.out.println("Zero digit character: " + zeroDigit);
    }
}
