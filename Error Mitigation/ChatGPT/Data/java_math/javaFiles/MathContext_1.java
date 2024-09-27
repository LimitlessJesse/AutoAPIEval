import java.math.MathContext;

public class MathContext_1 {
    public static void main(String[] args) {
        MathContext context = new MathContext(10);
        int precision = context.getPrecision();
        System.out.println("Precision setting: " + precision);
    }
}
