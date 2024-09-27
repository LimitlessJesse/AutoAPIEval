import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler_4 extends DefaultHandler {
    @Override
    public void startDocument() {
        System.out.println("Document processing started.");
    }

    public static void main(String[] args) {
        // Create an instance of Main and call startDocument
        Main main = new Main();
        main.startDocument();
    }
}
