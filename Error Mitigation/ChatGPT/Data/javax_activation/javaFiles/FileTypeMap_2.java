import javax.activation.FileTypeMap;
import javax.activation.MimetypesFileTypeMap;

public class FileTypeMap_2 {
    public static void main(String[] args) {
        FileTypeMap fileTypeMap = FileTypeMap.getDefaultFileTypeMap();
        System.out.println(fileTypeMap);
    }
}
