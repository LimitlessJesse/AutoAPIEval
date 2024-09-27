import java.net.URI;

public class URI_4 {
    public static void main(String[] args) {
        URI uri = URI.create("https://www.example.com/folder/file.txt");
        System.out.println("URI Path: " + uri.getPath());
    }
}
