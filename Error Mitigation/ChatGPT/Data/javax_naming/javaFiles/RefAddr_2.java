import javax.naming.RefAddr;

public class RefAddr_2 {
    public static void main(String[] args) {
        RefAddr refAddr = new RefAddr("test", "example");
        Object content = refAddr.getContent();
        System.out.println("Address content: " + content);
    }
}
