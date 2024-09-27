import javax.xml.soap.MimeHeaders;

public class MimeHeaders_5 {
    public static void main(String[] args) {
        MimeHeaders headers = new MimeHeaders();
        headers.addHeader("Content-Type", "application/json");
        
        // Removing the header with name "Content-Type"
        removeHeader(headers, "Content-Type");
    }
    
    public static void removeHeader(MimeHeaders headers, String name) {
        headers.removeHeader(name);
        System.out.println("Header '" + name + "' removed successfully.");
    }
}
