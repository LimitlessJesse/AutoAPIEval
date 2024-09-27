import javax.activation.FileDataSource;

public class FileDataSource_2 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("example.txt");
        String contentType = fileDataSource.getContentType();
        System.out.println("Content Type: " + contentType);
    }
}
