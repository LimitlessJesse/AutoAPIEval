import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_4 {
    public static void main(String[] args) {
        BinaryRefAddr binaryRefAddr = new BinaryRefAddr("addressType", new byte[]{0, 1, 2, 3});
        int hashCode = binaryRefAddr.hashCode();
        System.out.println("Hash code of BinaryRefAddr: " + hashCode);
    }
}
