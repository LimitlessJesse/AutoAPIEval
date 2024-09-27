import javax.naming.RefAddr;

public class RefAddr_5 {
    public static void main(String[] args) {
        RefAddr refAddr = new RefAddr("type", "contents");
        int hashCode = refAddr.hashCode();
        System.out.println("Hash code of the address: " + hashCode);
    }
}
