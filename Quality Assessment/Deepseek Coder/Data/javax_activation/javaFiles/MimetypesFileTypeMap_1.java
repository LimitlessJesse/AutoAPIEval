import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.IOException;

public class MimetypesFileTypeMap_1 {
    public static void main(String[] args) {
        MimetypesFileTypeMap mimetypesFileTypeMap = new MimetypesFileTypeMap();
        try {
            mimetypesFileTypeMap.loadMimeTypes(new File("mime.types"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("example.txt");
        String contentType = mimetypesFileTypeMap.getContentType(file);
        System.out.println("Content type of the file is: " + contentType);
    }
}
