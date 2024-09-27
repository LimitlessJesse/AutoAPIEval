import javax.activation.MimetypesFileTypeMap;
import java.io.File;

public class MimetypesFileTypeMap_1 {
    
    public static void main(String[] args) {
        File file = new File("example.txt");
        String contentType = getContentType(file);
        System.out.println("Content Type: " + contentType);
    }
    
    public static String getContentType(File file) {
        MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
        return mimeTypesMap.getContentType(file);
    }
}
