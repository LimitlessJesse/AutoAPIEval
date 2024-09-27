import javax.naming.RefAddr;

public class RefAddr_3 {
    public static void main(String[] args) {
        RefAddr refAddr = new RefAddr("type", "value");
        String type = refAddr.getType();
        System.out.println("Type: " + type);
    }
}
