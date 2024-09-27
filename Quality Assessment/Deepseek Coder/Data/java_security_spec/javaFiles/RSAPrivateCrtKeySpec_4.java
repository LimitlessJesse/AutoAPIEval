import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Random;

import javax.crypto.Cipher;

public class RSAPrivateCrtKeySpec_4 {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException {
        BigInteger p = BigInteger.probablePrime(512, new Random());
        BigInteger q = BigInteger.probablePrime(512, new Random());
        BigInteger d = BigInteger.probablePrime(512, new Random());
        BigInteger e = BigInteger.probablePrime(512, new Random());
        BigInteger n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        BigInteger modInv = e.modInverse(phi);
        BigInteger dP = modInv.mod(p.subtract(BigInteger.ONE));
        BigInteger dQ = modInv.mod(q.subtract(BigInteger.ONE));
        BigInteger qInv = q.modInverse(p);
        RSAPrivateCrtKeySpec privKeySpec = new RSAPrivateCrtKeySpec(n, e, d, p, q, dP, dQ, qInv);
        KeyFactory fact = KeyFactory.getInstance("RSA");
        fact.generatePrivate(privKeySpec);
    }
}
