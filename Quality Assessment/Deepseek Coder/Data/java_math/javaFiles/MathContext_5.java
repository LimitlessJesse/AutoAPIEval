import java.math.MathContext;
import java.math.RoundingMode;

public class MathContext_5 {
    public static void main(String[] args) {
        MathContext mathContext = new MathContext(5, RoundingMode.HALF_UP);
        RoundingMode roundingMode = mathContext.getRoundingMode();
        System.out.println(roundingMode);
    }
}
