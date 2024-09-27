import java.math.MathContext;

public class MathContext_3 {
    public static void main(String[] args) {
        MathContext mc = new MathContext(5);
        int precision = mc.getPrecision();
        System.out.println("Precision: " + precision);
    }
}
