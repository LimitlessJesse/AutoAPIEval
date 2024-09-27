import java.time.format.DecimalStyle;

public class DecimalStyle_4 {
    public static void main(String[] args) {
        DecimalStyle decimalStyle = DecimalStyle.STANDARD.withPositiveSign('+');
        System.out.println(decimalStyle.getPositiveSign());
    }
}
