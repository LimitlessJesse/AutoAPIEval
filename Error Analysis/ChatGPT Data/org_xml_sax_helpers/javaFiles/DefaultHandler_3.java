import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_3 extends DefaultHandler {
    
    public void characters(char[] ch, int start, int length) {
        String data = new String(ch, start, length);
        System.out.println("Parsed Data: " + data);
    }
    
    public static void main(String[] args) {
        Main handler = new Main();
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        handler.characters(data, 0, data.length);
    }
}
