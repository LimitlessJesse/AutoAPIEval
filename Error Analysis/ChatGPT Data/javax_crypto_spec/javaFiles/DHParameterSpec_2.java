import javax.crypto.spec.DHParameterSpec;
import java.math.BigInteger;

public class DHParameterSpec_2 {
    public static void main(String[] args) {
        DHParameterSpec dhParams = new DHParameterSpec(new BigInteger("1"), new BigInteger("2"), new BigInteger("3"));
        BigInteger g = dhParams.getG();
        System.out.println("Value of g: " + g);
    }
}
