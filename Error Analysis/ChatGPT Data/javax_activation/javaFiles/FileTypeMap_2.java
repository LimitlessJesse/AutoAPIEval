import javax.activation.FileTypeMap;
import java.io.File;

public class FileTypeMap_2 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        FileTypeMap fileTypeMap = FileTypeMap.getDefaultFileTypeMap();
        String contentType = fileTypeMap.getContentType(fileName);
        System.out.println("Content Type for " + fileName + " is: " + contentType);
    }
}
