import java.io.File;

public class File_4 {
    public static void main(String[] args) {
        // Create a new file
        File file = new File("example.txt");
        
        try {
            // Create the file
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
            
            // Delete the file
            boolean isDeleted = file.delete();
            if (isDeleted) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
