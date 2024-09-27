import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import java.util.List;

public class XMLSignatureFactory_3 {
    public static void main(String[] args) {
        String uri = "http://example.com";
        DigestMethod dm = null; // initialize with appropriate DigestMethod
        List transforms = null; // initialize with appropriate List of transforms
        String type = "http://www.w3.org/2000/09/xmldsig#Reference";
        String id = "reference-1";

        XMLSignatureFactory factory = XMLSignatureFactory.getInstance();
        factory.newReference(uri, dm, transforms, type, id);
    }
}
