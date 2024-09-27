import javax.activation.FileTypeMap;
import java.io.File;

public class FileTypeMap_2 {
    public static void main(String[] args) {
        FileTypeMap fileTypeMap = FileTypeMap.getDefaultFileTypeMap();
        File file = new File("path_to_your_file");
        String contentType = fileTypeMap.getContentType(file);
        System.out.println("Content Type: " + contentType);
    }
}
