import javax.xml.ws.spi.http.HttpContext;

public class HttpContext_1 {
    public static void main(String[] args) {
        HttpContext context = null; // Instantiate HttpContext object
        
        // Accessing attribute using getAttribute(String name) method
        Object attributeValue = context.getAttribute("attributeName");
        
        // Printing attribute value
        System.out.println(attributeValue);
    }
}
