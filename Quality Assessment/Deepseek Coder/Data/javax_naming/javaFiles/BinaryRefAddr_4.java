import javax.naming.BinaryRefAddr;

public class BinaryRefAddr_4 {
    public static void main(String[] args) {
        BinaryRefAddr addr1 = new BinaryRefAddr("foo", "bar".getBytes());
        BinaryRefAddr addr2 = new BinaryRefAddr("foo", "bar".getBytes());

        boolean isEqual = addr1.equals(addr2);

        System.out.println("Are addr1 and addr2 equal? " + isEqual);
    }
}
