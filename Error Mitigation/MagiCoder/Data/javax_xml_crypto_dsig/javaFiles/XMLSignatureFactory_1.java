import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class XMLSignatureFactory_1 {
    public static void main(String[] args) {
        try {
            XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM", "SunJSSE");
            TransformParameterSpec spec = new TransformParameterSpec();
            // Use the factory to create a signature
            //...
        } catch (NoSuchAlgorithmException | NoSuchProviderException e) {
            e.printStackTrace();
        }
    }
}
