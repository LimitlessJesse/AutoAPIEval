import org.xml.sax.ext.DefaultHandler2;

public class DefaultHandler2_2 extends DefaultHandler2 {
    
    @Override
    public void endCDATA() {
        // Code to handle the end of CDATA section
        System.out.println("End of CDATA section");
    }

    public static void main(String[] args) {
        Main handler = new Main();
        handler.endCDATA();
    }
}
