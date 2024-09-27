import java.security.SecureRandom;
import java.security.SecureRandomSpi;

public class SecureRandomSpi_2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        SecureRandomSpi secureRandomSpi = secureRandom.getProvider().getService("SecureRandom", "SHA1PRNG");
        
        byte[] seed = {1, 2, 3, 4, 5};
        secureRandomSpi.engineSetSeed(seed);
    }
}
