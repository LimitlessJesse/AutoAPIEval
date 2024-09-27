import javax.naming.RefAddr;

public class RefAddr_1 {
    public static void main(String[] args) {
        RefAddr refAddr = new RefAddr("type", "value");
        String addressType = refAddr.getType();
        System.out.println("Address Type: " + addressType);
    }
}
