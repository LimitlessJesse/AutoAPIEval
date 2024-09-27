import org.xml.sax.ext.DefaultHandler2;

public class DefaultHandler2_4 extends DefaultHandler2 {

    @Override
    public void endDTD() {
        System.out.println("End of DTD subset");
    }

    public static void main(String[] args) {
        // Create an instance of Main class to call endDTD()
        Main handler = new Main();
        handler.endDTD();
    }
}
