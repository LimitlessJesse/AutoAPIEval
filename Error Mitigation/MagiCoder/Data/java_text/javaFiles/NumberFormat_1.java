import java.text.NumberFormat;

public class NumberFormat_1 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.format(1234567.89));
    }
}
