import javax.activation.URLDataSource;

public class URLDataSource_2 {
    public static void main(String[] args) {
        URLDataSource dataSource = new URLDataSource(url);
        String contentType = dataSource.getContentType();
        System.out.println("Content Type: " + contentType);
    }
}
