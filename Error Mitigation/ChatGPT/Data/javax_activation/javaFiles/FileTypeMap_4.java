import javax.activation.FileTypeMap;

public class FileTypeMap_4 {
    public static void main(String[] args) {
        String filename = "example.txt";
        FileTypeMap fileTypeMap = FileTypeMap.getDefaultFileTypeMap();
        String contentType = fileTypeMap.getContentType(filename);
        System.out.println("Content type of " + filename + " is: " + contentType);
    }
}
