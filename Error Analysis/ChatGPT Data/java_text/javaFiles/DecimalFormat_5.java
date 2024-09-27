import java.text.DecimalFormat;

public class DecimalFormat_5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Value before setting decimal separator always shown: " + df.format(1234567.89));

        df.setDecimalSeparatorAlwaysShown(true);
        System.out.println("Value after setting decimal separator always shown: " + df.format(1234567.89));
    }
}
