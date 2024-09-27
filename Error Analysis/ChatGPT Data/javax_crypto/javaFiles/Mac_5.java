import javax.crypto.Mac;

public class Mac_5 {
    public static void main(String[] args) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            int macLength = mac.getMacLength();
            System.out.println("MAC Length: " + macLength);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
