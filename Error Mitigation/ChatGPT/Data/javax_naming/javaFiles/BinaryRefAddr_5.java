import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_5 {
    public static void main(String[] args) {
        BinaryRefAddr binaryRefAddr = new BinaryRefAddr("type", new byte[]{0x01, 0x02, 0x03, 0x04});
        System.out.println(binaryRefAddr.toString());
    }
}
