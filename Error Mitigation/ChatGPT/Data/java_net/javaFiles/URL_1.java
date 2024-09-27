import java.net.URL;

public class URL_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com/index.html?query=example");
            String fileName = url.getFile();
            System.out.println("File Name: " + fileName);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
