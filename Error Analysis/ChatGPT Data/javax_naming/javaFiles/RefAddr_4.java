import javax.naming.RefAddr;

public class RefAddr_4 {
    public static void main(String[] args) {
        RefAddr refAddr = new RefAddr("type", "content");
        Object content = refAddr.getContent();
        System.out.println(content);
    }
}
