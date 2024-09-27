import javax.activation.MimeTypeParameterList;

public class MimeTypeParameterList_3 {
    public static void main(String[] args) {
        // Create a MimeTypeParameterList
        MimeTypeParameterList list = new MimeTypeParameterList("text/plain");

        // Add parameters to the list
        list.set("charset", "UTF-8");
        list.set("format", "flowed");
        
        // Print the list before removing a parameter
        System.out.println("Before removing: " + list.toString());
        
        // Remove a parameter by name
        list.remove("format");
        
        // Print the list after removing a parameter
        System.out.println("After removing: " + list.toString());
    }
}
