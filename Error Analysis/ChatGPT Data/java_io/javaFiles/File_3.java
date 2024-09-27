import java.io.File;

public class File_3 {
    public static void main(String[] args) {
        File directory = new File("path/to/directory");
        String[] fileList = directory.list();
        
        if (fileList != null) {
            for (String file : fileList) {
                System.out.println(file);
            }
        }
    }
}
