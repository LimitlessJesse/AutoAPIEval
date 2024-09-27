import java.net.ContentHandler;
import java.net.URLConnection;

public class ContentHandler_2 {
    public static void main(String[] args) {
        // URLConnection uc = create URLConnection object
        // Class[] classes = create an array of classes
        
        // Call getContent method
        Object content = getContent(uc, classes);
    }
    
    public static Object getContent(URLConnection uc, Class[] classes) {
        try {
            ContentHandler contentHandler = uc.getContentHandler();
            return contentHandler.getContent(uc, classes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
