import javax.activation.MimetypesFileTypeMap;

public class MimetypesFileTypeMap_2 {
    public static void main(String[] args) {
        MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
        String fileName = "example.txt";
        String contentType = mimeTypesMap.getContentType(fileName);
        System.out.println("The content type of the file " + fileName + " is: " + contentType);
    }
}
