import java.time.format.DecimalStyle;

public class DecimalStyle_4 {
    public static void main(String[] args) {
        DecimalStyle decimalStyle = DecimalStyle.STANDARD;
        System.out.println("Original Decimal Separator: " + decimalStyle.getDecimalSeparator());
        
        DecimalStyle newDecimalStyle = decimalStyle.withDecimalSeparator(',');
        System.out.println("New Decimal Separator: " + newDecimalStyle.getDecimalSeparator());
    }
}
