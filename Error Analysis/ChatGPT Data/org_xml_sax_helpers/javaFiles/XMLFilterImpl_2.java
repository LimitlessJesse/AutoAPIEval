import org.xml.sax.helpers.XMLFilterImpl;

public class XMLFilterImpl_2 extends XMLFilterImpl {
    
    @Override
    public void endDocument() {
        System.out.println("End of document reached");
    }
    
    public static void main(String[] args) {
        Main customXMLFilter = new Main();
        customXMLFilter.endDocument();
    }
}
