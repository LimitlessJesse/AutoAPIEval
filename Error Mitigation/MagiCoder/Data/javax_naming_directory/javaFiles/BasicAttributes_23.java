import javax.naming.directory.BasicAttributes;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.DirContext;

public class BasicAttributes_23 {
    public static void main(String[] args) {
        try {
            // Create a new BasicAttributes object
            BasicAttributes attrs = new BasicAttributes();

            // Add an attribute to the BasicAttributes object
            attrs.put(new BasicAttribute("cn", "John Doe"));

            // Use the toString() method to print the contents of the BasicAttributes object
            System.out.println(attrs.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
