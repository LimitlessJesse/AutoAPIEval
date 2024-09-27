import javax.activation.MimetypesFileTypeMap;

public class MimetypesFileTypeMap_2 {
    public static void main(String[] args) {
        MimetypesFileTypeMap mimetypesFileTypeMap = new MimetypesFileTypeMap();
        String filename = "example.txt";
        String contentType = mimetypesFileTypeMap.getContentType(filename);
        System.out.println("Content Type for " + filename + ": " + contentType);
    }
}
