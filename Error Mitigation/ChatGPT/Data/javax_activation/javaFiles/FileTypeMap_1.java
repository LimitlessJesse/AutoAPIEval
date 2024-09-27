import javax.activation.FileTypeMap;
import java.io.File;

public class FileTypeMap_1 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        String contentType = FileTypeMap.getDefaultFileTypeMap().getContentType(file);
        System.out.println("Content type of the file: " + contentType);
    }
}
