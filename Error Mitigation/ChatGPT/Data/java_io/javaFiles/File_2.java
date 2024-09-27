import java.io.File;

public class File_2 {
    public static void main(String[] args) {
        File directory = new File("newDirectory");
        boolean created = directory.mkdir();
        
        if(created) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Failed to create directory");
        }
    }
}
