import javax.xml.transform.dom.DOMSource;

public class DOMSource_4 {
    public static void main(String[] args) {
        DOMSource source = new DOMSource();
        String systemId = source.getSystemId();
        System.out.println("System ID: " + systemId);
    }
}
