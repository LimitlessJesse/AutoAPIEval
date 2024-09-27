import javax.swing.text.StringContent;

public class StringContent_3 {
    public static void main(String[] args) {
        // Create a StringContent object
        StringContent content = new StringContent();
        
        // Set some content
        content.insertString(0, "Hello, World!");
        
        // Use getString(int where, int len) to get a substring
        String substring = content.getString(7, 5);
        
        // Output the substring
        System.out.println(substring); // Output: World
    }
}
