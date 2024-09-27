import javax.xml.transform.sax.SAXSource;

public class SAXSource_3 {
    public static void main(String[] args) {
        SAXSource source = new SAXSource();
        String systemId = "http://example.com/xml";
        source.setSystemId(systemId);
    }
}
