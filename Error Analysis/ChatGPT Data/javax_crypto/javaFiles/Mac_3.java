import javax.crypto.Mac;
import javax.crypto.KeyGenerator;

public class Mac_3 {
    public static void main(String[] args) {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");

            // Resetting the MAC object
            mac.reset();

            System.out.println("MAC object reset successfully.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
