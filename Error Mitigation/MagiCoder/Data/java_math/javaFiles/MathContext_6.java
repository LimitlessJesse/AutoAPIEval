import java.math.MathContext;

public class MathContext_6 {
    public static void main(String[] args) {
        MathContext mc = new MathContext(5);
        int hashCode = mc.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
