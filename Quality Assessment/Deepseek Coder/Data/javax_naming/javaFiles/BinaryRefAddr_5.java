import javax.naming.BinaryRefAddr;
import javax.naming.RefAddr;
import javax.naming.Reference;

public class BinaryRefAddr_5 {
    public static void main(String[] args) throws Exception {
        // Create a new Reference
        Reference ref = new Reference("javax.naming.BinaryRefAddr");

        // Create a new BinaryRefAddr
        RefAddr refAddr = new BinaryRefAddr("myBinaryRefAddr", new byte[]{1, 2, 3, 4, 5});

        // Add the RefAddr to the Reference
        ref.add(refAddr);

        // Get the hash code of the Reference
        int hashCode = ref.hashCode();

        // Print the hash code
        System.out.println("Hash code: " + hashCode);
    }
}
