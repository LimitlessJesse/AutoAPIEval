import java.io.File;

public class File_4 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        
        // Deleting the file
        boolean isDeleted = file.delete();
        
        if(isDeleted) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
