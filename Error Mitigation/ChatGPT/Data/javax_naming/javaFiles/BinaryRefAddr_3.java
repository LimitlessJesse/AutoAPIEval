import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_3 {
    public static void main(String[] args) {
        BinaryRefAddr addr1 = new BinaryRefAddr("type", new byte[]{1, 2, 3});
        BinaryRefAddr addr2 = new BinaryRefAddr("type", new byte[]{1, 2, 3});
        
        boolean isEqual = addr1.equals(addr2);
        System.out.println("Are the addresses equal? " + isEqual);
    }
}
