import java.text.NumberFormat;

public class NumberFormat_1 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        double number = 12345.6789;
        System.out.println(numberFormat.format(number));
    }
}
