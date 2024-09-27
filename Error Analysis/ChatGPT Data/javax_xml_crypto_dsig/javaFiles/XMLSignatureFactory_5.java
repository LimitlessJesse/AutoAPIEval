import javax.xml.crypto.dsig.XMLObject;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import java.util.ArrayList;
import java.util.List;

public class XMLSignatureFactory_5 {
    public static void main(String[] args) {
        List content = new ArrayList();
        String id = "exampleId";
        String mimeType = "text/plain";
        String encoding = "UTF-8";

        XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
        XMLObject xmlObject = fac.newXMLObject(content, id, mimeType, encoding);
    }
}
