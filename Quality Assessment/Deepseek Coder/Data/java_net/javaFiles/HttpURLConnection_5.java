import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnection_5 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();

        // Set request method to POST
        http.setRequestMethod("POST");

        // Set other request properties
        http.setRequestProperty("User-Agent", "Java client");
        http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

        String urlParameters = "param1=value1&param2=value2";

        // Send post request
        http.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(http.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = http.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);

        http.disconnect();
    }
}
