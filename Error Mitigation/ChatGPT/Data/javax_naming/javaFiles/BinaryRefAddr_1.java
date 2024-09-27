import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_1 {
    public static void main(String[] args) {
        BinaryRefAddr binaryRefAddr = new BinaryRefAddr("addressType", new byte[]{0x01, 0x02, 0x03});
        Object content = binaryRefAddr.getContent();
        byte[] contentBytes = (byte[]) content;
        System.out.println("Content: " + contentBytes);
    }
}
