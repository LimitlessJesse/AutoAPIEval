import java.math.BigInteger;

public class BigInteger_8 {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("100");
        BigInteger bigInteger2 = new BigInteger("200");

        int result = bigInteger1.compareTo(bigInteger2);

        if (result < 0) {
            System.out.println("bigInteger1 is less than bigInteger2");
        } else if (result == 0) {
            System.out.println("bigInteger1 is equal to bigInteger2");
        } else {
            System.out.println("bigInteger1 is greater than bigInteger2");
        }
    }
}
