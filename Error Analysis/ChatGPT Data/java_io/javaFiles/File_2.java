import java.io.File;

public class File_2 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        
        // Check if the file exists
        if(file.exists()){
            boolean isDeleted = file.delete(); // Delete the file
            if(isDeleted){
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        } else {
            System.out.println("File does not exist");
        }
    }
}
