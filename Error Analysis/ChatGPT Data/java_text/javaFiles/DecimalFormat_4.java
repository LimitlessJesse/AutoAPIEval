import java.text.DecimalFormat;

public class DecimalFormat_4 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        DecimalFormat dfCopy = (DecimalFormat) df.clone();
        System.out.println("Original DecimalFormat: " + df.format(1234567.89));
        System.out.println("Cloned DecimalFormat: " + dfCopy.format(9876543.21));
    }
}
