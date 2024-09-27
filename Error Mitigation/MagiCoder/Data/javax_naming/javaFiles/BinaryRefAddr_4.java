import javax.naming.BinaryRefAddr;
import javax.naming.RefAddr;

public class BinaryRefAddr_4 {
    public static void main(String[] args) {
        BinaryRefAddr addr1 = new BinaryRefAddr("type1", new byte[]{1, 2, 3});
        BinaryRefAddr addr2 = new BinaryRefAddr("type1", new byte[]{1, 2, 3});
        BinaryRefAddr addr3 = new BinaryRefAddr("type2", new byte[]{1, 2, 3});

        System.out.println(addr1.equals(addr2));  // true
        System.out.println(addr1.equals(addr3));  // false
    }
}
