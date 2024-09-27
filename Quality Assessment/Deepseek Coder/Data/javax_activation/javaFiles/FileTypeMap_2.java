import javax.activation.FileTypeMap;
import java.io.File;

public class FileTypeMap_2 {
    public static void main(String[] args) {
        FileTypeMap fileTypeMap = FileTypeMap.getDefaultFileTypeMap();
        File file = new File("example.txt");
        String contentType = fileTypeMap.getContentType(file);
        System.out.println("Content type of the file is: " + contentType);
    }
}
