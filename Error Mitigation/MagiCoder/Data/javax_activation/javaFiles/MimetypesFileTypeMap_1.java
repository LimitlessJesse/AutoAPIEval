import javax.activation.MimetypesFileTypeMap;

public class MimetypesFileTypeMap_1 {
    public static void main(String[] args) {
        MimetypesFileTypeMap mimetypesFileTypeMap = new MimetypesFileTypeMap();
        String fileName = "example.txt";
        String contentType = mimetypesFileTypeMap.getContentType(fileName);
        System.out.println("The content type of the file " + fileName + " is: " + contentType);
    }
}
