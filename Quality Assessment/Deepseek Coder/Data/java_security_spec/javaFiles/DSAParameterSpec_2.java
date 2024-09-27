import java.math.BigInteger;
import java.security.spec.DSAParameterSpec;

public class DSAParameterSpec_2 {
    public static void main(String[] args) {
        BigInteger p = new BigInteger("8834592023555340468376945730918836807923106829468121283877774063813593451292");
        BigInteger q = new BigInteger("1162258900746254053429797463942464994865895209477346262510228443859277264467");
        BigInteger g = new BigInteger("5958055059618410813896050046073467310080159208164848889446671001231331316876");

        DSAParameterSpec params = new DSAParameterSpec(p, q, g);

        BigInteger qValue = params.getQ();

        System.out.println("The value of q is: " + qValue);
    }
}
