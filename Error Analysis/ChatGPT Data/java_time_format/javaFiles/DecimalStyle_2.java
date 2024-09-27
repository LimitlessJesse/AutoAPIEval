import java.time.format.DecimalStyle;

public class DecimalStyle_2 {
    public static void main(String[] args) {
        DecimalStyle decimalStyle = DecimalStyle.STANDARD;
        char positiveSign = decimalStyle.getPositiveSign();
        System.out.println("Positive sign: " + positiveSign);
    }
}
