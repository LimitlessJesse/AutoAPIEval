import java.net.*;

public class URLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection connection = url.openConnection();
            
            // Set the connection to allow output
            connection.setDoOutput(true);
            
            System.out.println("doOutput is set to: " + connection.getDoOutput());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
