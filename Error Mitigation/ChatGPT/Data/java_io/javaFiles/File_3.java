import java.io.File;

public class File_3 {
    public static void main(String[] args) {
        File directory = new File("path/to/directory");
        
        String[] filesAndDirectories = directory.list();
        
        if(filesAndDirectories != null) {
            for(String name : filesAndDirectories) {
                System.out.println(name);
            }
        } else {
            System.out.println("Directory is empty or does not exist.");
        }
    }
}
