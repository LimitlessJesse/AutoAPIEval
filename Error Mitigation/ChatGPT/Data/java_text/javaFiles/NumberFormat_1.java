import java.text.NumberFormat;

public class NumberFormat_1 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        double number = 12345.67;
        String formattedNumber = numberFormat.format(number);
        System.out.println("Formatted Number: " + formattedNumber);
    }
}
