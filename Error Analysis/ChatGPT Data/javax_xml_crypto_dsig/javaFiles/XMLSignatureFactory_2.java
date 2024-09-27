import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import java.security.Key;
import java.util.Collections;

public class XMLSignatureFactory_2 {
    public static void main(String[] args) {
        XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

        // Create SignedInfo
        // Note: SignedInfo creation requires other specifications like CanonicalizationMethod, SignatureMethod, and References
        SignedInfo si = fac.newSignedInfo(
                fac.newCanonicalizationMethod(C14NMethodParameterSpec.INCLUSIVE, (TransformParameterSpec) null),
                fac.newSignatureMethod("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", (SignatureMethodParameterSpec) null),
                Collections.singletonList(fac.newReference("#reference-1",
                        fac.newDigestMethod("http://www.w3.org/2001/04/xmlenc#sha256", null),
                        Collections.singletonList(fac.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (TransformParameterSpec) null)),
                        null, null))
        );

        // Create KeyInfo 
        // Note: KeyInfo creation requires information about the key being used for signature
        KeyInfo ki = fac.newKeyInfo(Collections.singletonList(fac.newKeyValue((Key) null)));

        // Generate XMLSignature using SignedInfo and KeyInfo
        XMLSignature signature = fac.newXMLSignature(si, ki);

        // The XMLSignature object can now be used for signing or verifying XML documents
    }
}
