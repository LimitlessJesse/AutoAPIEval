import javax.naming.*;

public class RefAddr_3 {
    public static void main(String[] args) throws NamingException {
        // Create a reference address
        RefAddr refAddr = new RefAddr("type", "address");

        // Get the type of the address
        String type = refAddr.getType();

        // Print the type
        System.out.println("Type: " + type);
    }
}
