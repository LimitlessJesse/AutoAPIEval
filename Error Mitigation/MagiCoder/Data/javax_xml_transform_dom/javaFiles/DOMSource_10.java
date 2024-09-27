import javax.xml.transform.dom.DOMSource;

public class DOMSource_10 {
    public static void main(String[] args) {
        DOMSource domSource = new DOMSource();
        String systemId = domSource.getSystemId();
        System.out.println(systemId);
    }
}
