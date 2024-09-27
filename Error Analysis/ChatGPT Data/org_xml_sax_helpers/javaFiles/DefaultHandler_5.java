import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    @Override
    public void endDocument() {
        System.out.println("End of document");
    }

    public static void main(String[] args) {
        // Create an instance of MyHandler and use it to parse an XML document
    }
}
