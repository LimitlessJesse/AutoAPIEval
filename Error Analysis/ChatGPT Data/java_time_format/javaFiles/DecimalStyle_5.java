import java.time.format.DecimalStyle;

public class DecimalStyle_5 {
    public static void main(String[] args) {
        char zeroDigit = '0';
        DecimalStyle decimalStyle = DecimalStyle.STANDARD.withZeroDigit(zeroDigit);
        
        System.out.println(decimalStyle.zeroDigit());
    }
}
