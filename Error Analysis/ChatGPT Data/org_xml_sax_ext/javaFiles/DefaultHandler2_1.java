import org.xml.sax.ext.DefaultHandler2;

public class DefaultHandler2_1 extends DefaultHandler2 {

    @Override
    public void startCDATA() {
        System.out.println("Start of CDATA section");
    }

    public static void main(String[] args) {
        Main handler = new Main();
        handler.startCDATA();
    }
}
