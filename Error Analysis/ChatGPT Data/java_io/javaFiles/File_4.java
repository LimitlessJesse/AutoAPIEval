import java.io.File;

public class File_4 {
    public static void main(String[] args) {
        File directory = new File("newDirectory");
        boolean success = directory.mkdir();
        
        if (success) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Failed to create directory");
        }
    }
}
