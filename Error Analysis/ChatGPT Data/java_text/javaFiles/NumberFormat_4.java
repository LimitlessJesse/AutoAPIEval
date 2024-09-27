import java.text.NumberFormat;

public class NumberFormat_4 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        double number = 123.456789;
        System.out.println(nf.format(number));
    }
}
