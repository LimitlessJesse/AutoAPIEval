import javax.activation.URLDataSource;

public class URLDataSource_2 {
    public static void main(String[] args) {
        URLDataSource urlDataSource = new URLDataSource();
        String contentType = urlDataSource.getContentType();
        System.out.println("Content Type: " + contentType);
    }
}
