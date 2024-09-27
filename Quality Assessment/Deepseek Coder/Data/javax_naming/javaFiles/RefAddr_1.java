import javax.naming.RefAddr;
import javax.naming.Reference;

public class RefAddr_1 {
    public static void main(String[] args) {
        try {
            // Create a RefAddr
            RefAddr refAddr1 = new RefAddr("type", "value");
            RefAddr refAddr2 = new RefAddr("type", "value");

            // Use equals method
            boolean isEqual = refAddr1.equals(refAddr2);

            // Print the result
            System.out.println("Are the two RefAddrs equal? " + isEqual);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
