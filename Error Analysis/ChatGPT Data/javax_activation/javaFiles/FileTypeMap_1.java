import javax.activation.FileTypeMap;
import java.io.File;

public class FileTypeMap_1 {
    public static void main(String[] args) {
        File file = new File("sample.pdf");
        String contentType = FileTypeMap.getDefaultFileTypeMap().getContentType(file);
        System.out.println("Content Type: " + contentType);
    }
}
