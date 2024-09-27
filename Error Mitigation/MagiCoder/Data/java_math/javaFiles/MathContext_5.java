import java.math.MathContext;

public class MathContext_5 {
    public static void main(String[] args) {
        MathContext mc1 = new MathContext(5);
        MathContext mc2 = new MathContext(5);
        MathContext mc3 = new MathContext(10);

        System.out.println(mc1.equals(mc2));  // true
        System.out.println(mc1.equals(mc3));  // false
    }
}
