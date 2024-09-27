import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_1 {
    public static void main(String[] args) {
        BinaryRefAddr binaryRefAddr = new BinaryRefAddr("test", new byte[]{0x01, 0x02, 0x03});
        
        byte[] content = (byte[]) binaryRefAddr.getContent();
        
        for (byte b : content) {
            System.out.print(b + " ");
        }
    }
}
