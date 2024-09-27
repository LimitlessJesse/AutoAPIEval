import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_2 {
    public static void main(String[] args) {
        PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());
        byte[] salt = pbeKeySpec.getSalt();
        if (salt!= null) {
            for (byte b : salt) {
                System.out.print(b + " ");
            }
        } else {
            System.out.println("Salt is null");
        }
    }
}
