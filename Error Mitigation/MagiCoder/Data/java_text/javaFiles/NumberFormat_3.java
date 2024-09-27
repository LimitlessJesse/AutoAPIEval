import java.text.NumberFormat;

public class NumberFormat_3 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        double number = 123456.789;
        String formattedNumber = nf.format(number);
        System.out.println(formattedNumber);
    }
}
