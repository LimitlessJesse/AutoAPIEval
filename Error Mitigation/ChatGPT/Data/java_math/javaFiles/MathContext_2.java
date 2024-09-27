import java.math.MathContext;
import java.math.RoundingMode;

public class MathContext_2 {
    public static void main(String[] args) {
        MathContext mathContext = new MathContext(10, RoundingMode.HALF_UP);
        RoundingMode roundingMode = mathContext.getRoundingMode();
        System.out.println("Rounding Mode: " + roundingMode);
    }
}
