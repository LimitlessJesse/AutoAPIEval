import javax.activation.URLDataSource;

public class URLDataSource_3 {
    public static void main(String[] args) {
        URLDataSource urlDataSource = new URLDataSource();
        String name = urlDataSource.getName();
        System.out.println("Name of the URL data source: " + name);
    }
}
