import java.text.NumberFormat;

public class NumberFormat_2 {
    public static void main(String[] args) {
        long number = 1234567890;
        NumberFormat formatter = NumberFormat.getInstance();
        String formattedNumber = formatter.format(number);
        System.out.println(formattedNumber);
    }
}
