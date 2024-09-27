import javax.naming.StringRefAddr;

public class StringRefAddr_2 {
    public static void main(String[] args) {
        String address = "example address";
        StringRefAddr refAddr = new StringRefAddr("type", address);
        
        Object content = refAddr.getContent();
        System.out.println("Address content: " + content);
    }
}
