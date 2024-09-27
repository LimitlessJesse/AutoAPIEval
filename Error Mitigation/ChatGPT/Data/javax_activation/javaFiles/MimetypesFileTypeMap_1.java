import javax.activation.MimetypesFileTypeMap;
import java.io.File;

public class MimetypesFileTypeMap_1 {
    public static void main(String[] args) {
        MimetypesFileTypeMap mimetypesFileTypeMap = new MimetypesFileTypeMap();
        File file = new File("example.txt");
        String contentType = mimetypesFileTypeMap.getContentType(file);
        System.out.println("MIME type of the file: " + contentType);
    }
}
