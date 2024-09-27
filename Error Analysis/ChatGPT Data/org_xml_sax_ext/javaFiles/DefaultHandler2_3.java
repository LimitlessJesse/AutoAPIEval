import org.xml.sax.ext.DefaultHandler2;

public class DefaultHandler2_3 extends DefaultHandler2 {
    @Override
    public void startDTD(String name, String publicId, String systemId) {
        System.out.println("Start of DTD:");
        System.out.println("Name: " + name);
        System.out.println("Public ID: " + publicId);
        System.out.println("System ID: " + systemId);
    }

    public static void main(String[] args) {
        Main handler = new Main();
        handler.startDTD("myDTD", "-//W3C//DTD HTML 4.01 Transitional//EN", "http://www.w3.org/TR/html4/loose.dtd");
    }
}
