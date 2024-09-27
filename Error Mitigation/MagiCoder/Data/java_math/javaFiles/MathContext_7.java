import java.math.MathContext;
import java.math.RoundingMode;

public class MathContext_7 {
    public static void main(String[] args) {
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(mc.toString());
    }
}
