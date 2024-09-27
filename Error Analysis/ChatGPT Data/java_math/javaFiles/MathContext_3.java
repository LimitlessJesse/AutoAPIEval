import java.math.MathContext;
import java.math.RoundingMode;

public class MathContext_3 {
    public static void main(String[] args) {
        MathContext mathContext = new MathContext(4, RoundingMode.HALF_UP);
        RoundingMode roundingMode = mathContext.getRoundingMode();
        System.out.println("Rounding Mode: " + roundingMode);
    }
}
