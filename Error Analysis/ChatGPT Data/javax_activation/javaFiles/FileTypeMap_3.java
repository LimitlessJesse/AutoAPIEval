import javax.activation.FileTypeMap;

public class FileTypeMap_3 {
    public static void main(String[] args) {
        // Get the default file type map
        FileTypeMap fileTypeMap = FileTypeMap.getDefaultFileTypeMap();
        
        // Use the file type map as needed
        System.out.println("Default content type of txt file: " + fileTypeMap.getContentType("file.txt"));
    }
}
