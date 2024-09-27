import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public class Mac_1 {
    public static void main(String[] args) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            System.out.println(mac);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }
}
