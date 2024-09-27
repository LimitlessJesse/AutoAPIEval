import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.DHParameterSpec;
import java.math.BigInteger;

public class DHParameterSpec_4 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("103367899232444797846886009750744406764078740559298518910538674365990967878768465562825184006535009182779959876094618811198660400613938695211280239957691866892286613");
        BigInteger g = new BigInteger("5");
        DHParameterSpec dhParameterSpec = new DHParameterSpec(p, g);
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(dhParameterSpec.getY());
        System.out.println(dhPublicKeySpec.getL());
    }
}
