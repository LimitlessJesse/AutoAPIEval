import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_4 {
    public static void main(String[] args) {
        BinaryRefAddr refAddr1 = new BinaryRefAddr("key1", new byte[] {0,1,2});
        BinaryRefAddr refAddr2 = new BinaryRefAddr("key1", new byte[] {0,1,2});

        boolean result = refAddr1.equals(refAddr2);
        System.out.println(result); // Output: true
    }
}
