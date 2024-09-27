import javax.naming.*;

public class CompositeName_3 {
    public static void main(String[] args) {
        try {
            // Create a composite name
            CompositeName compositeName = new CompositeName("com", "example", "sub");

            // Get the size of the composite name
            int size = compositeName.size();

            // Print the size
            System.out.println("Size of the composite name: " + size);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
