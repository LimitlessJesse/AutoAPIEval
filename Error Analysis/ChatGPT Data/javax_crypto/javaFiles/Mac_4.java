import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Mac_4 {
    public static void main(String[] args) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] keyData = "secretKey".getBytes();
            SecretKeySpec key = new SecretKeySpec(keyData, "HmacSHA256");
            mac.init(key);
            
            byte[] message = "Hello World".getBytes();
            byte[] result = mac.doFinal(message);
            
            System.out.println("MAC result: " + new String(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
