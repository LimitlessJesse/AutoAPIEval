import javax.activation.FileTypeMap;

public class FileTypeMap_5 {
    public static void main(String[] args) {
        FileTypeMap fileTypeMap = new FileTypeMap() {
            @Override
            public String getContentType(File file) {
                return null;
            }
        };
        
        FileTypeMap.setDefaultFileTypeMap(fileTypeMap);
    }
}
