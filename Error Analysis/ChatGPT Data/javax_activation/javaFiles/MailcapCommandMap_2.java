import javax.activation.DataContentHandler;
import javax.activation.MailcapCommandMap;

public class MailcapCommandMap_2 {
    public static void main(String[] args) {
        MailcapCommandMap mailcap = new MailcapCommandMap();
        DataContentHandler handler = mailcap.createDataContentHandler("text/plain");
        
        System.out.println("DataContentHandler created for text/plain: " + handler.getClass().getName());
    }
}
