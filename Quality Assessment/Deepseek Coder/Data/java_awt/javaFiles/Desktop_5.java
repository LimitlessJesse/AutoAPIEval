import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Desktop_5 {
    public static void main(String[] args) {
        // Create a new file
        File file = new File("example.txt");
        
        // Check if the file exists
        if (file.exists()) {
            // Get the Desktop instance
            Desktop desktop = Desktop.getDesktop();
            
            try {
                // Print the file
                desktop.print(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
