import javax.naming.RefAddr;
import javax.naming.Reference;

public class RefAddr_3 {
    public static void main(String[] args) {
        try {
            // Create a RefAddr
            RefAddr refAddr = new RefAddr("type", "value");

            // Get the type of the RefAddr
            String type = refAddr.getType();

            // Print the type
            System.out.println("Type: " + type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
