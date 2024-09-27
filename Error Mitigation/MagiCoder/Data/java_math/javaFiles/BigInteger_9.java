import java.math.BigInteger;

public class BigInteger_9 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("123456789012345678901234567890");
        BigInteger nextPrime = bigInteger.nextProbablePrime();
        System.out.println("Next probable prime: " + nextPrime);
    }
}
