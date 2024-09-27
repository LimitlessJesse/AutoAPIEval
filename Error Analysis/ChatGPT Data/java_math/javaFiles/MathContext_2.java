import java.math.MathContext;

public class MathContext_2 {
    public static void main(String[] args) {
        MathContext mc = new MathContext(2);
        int precision = mc.getPrecision();
        System.out.println("Precision: " + precision);
    }
}
