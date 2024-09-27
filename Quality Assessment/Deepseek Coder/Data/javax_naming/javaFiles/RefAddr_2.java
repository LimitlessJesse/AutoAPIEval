import javax.naming.RefAddr;
import javax.naming.Reference;

public class RefAddr_2 {
    public static void main(String[] args) {
        try {
            // Create a reference
            Reference ref = new Reference("javax.naming.Reference");
            
            // Create a reference address
            RefAddr addr = new RefAddr("address", "127.0.0.1");
            
            // Add the reference address to the reference
            ref.add(addr);
            
            // Get the hash code of the reference address
            int hashCode = addr.hashCode();
            
            // Print the hash code
            System.out.println("Hash code: " + hashCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
