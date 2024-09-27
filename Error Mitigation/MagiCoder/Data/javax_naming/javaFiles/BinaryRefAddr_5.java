import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_5 {
    public static void main(String[] args) {
        BinaryRefAddr addr = new BinaryRefAddr("type", "contents".getBytes());
        int hashCode = addr.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
