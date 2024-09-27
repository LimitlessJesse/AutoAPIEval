import javax.activation.MimetypesFileTypeMap;

public class MimetypesFileTypeMap_2 {
    public static void main(String[] args) {
        String filename = "example.txt";
        MimetypesFileTypeMap mimetypes = new MimetypesFileTypeMap();
        String contentType = mimetypes.getContentType(filename);
        System.out.println("Content Type: " + contentType);
    }
}
