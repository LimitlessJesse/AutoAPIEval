import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyInfoGenerator;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.SignatureMethodSpec;

public class XMLSignatureFactory_1 {
    public static void main(String[] args) throws Exception {
        // Generate a key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        Key privateKey = keyPair.getPrivate();
        Key publicKey = keyPair.getPublic();

        // Create a signature
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);

        // Create a XMLSignatureFactory
        XMLSignatureFactory xmlSignatureFactory = XMLSignatureFactory.getInstance("DOM");

        // Create a SignatureMethod
        SignatureMethod signatureMethod = xmlSignatureFactory.getSignatureMethod(new SignatureMethodSpec("RSA-SHA256"));

        // Create a CanonicalizationMethod
        CanonicalizationMethod canonicalizationMethod = xmlSignatureFactory.getCanonicalizationMethod(CanonicalizationMethod.ALGO_ID_C14N11_COMMENTS);

        // Create a DigestMethod
        DigestMethod digestMethod = xmlSignatureFactory.getDigestMethod(DigestMethod.ALGO_ID_SHA256);

        // Create a KeyInfo
        KeyInfoGenerator keyInfoGenerator = xmlSignatureFactory.getKeyInfoGenerator();
        keyInfoGenerator.init(new X509Data(new X509EncodedKeySpec(publicKey.getEncoded())), new C14NMethodParameterSpec(canonicalizationMethod.getAlgorithm()));
        KeyInfo keyInfo = keyInfoGenerator.generateKeyInfo();

        // Create a XMLSignature
        XMLSignature xmlSignature = xmlSignatureFactory.newXMLSignature(keyInfo, new SignatureMethod[]{signatureMethod}, new CanonicalizationMethod[]{canonicalizationMethod}, new DigestMethod[]{digestMethod});

        // Sign the XML
        byte[] xmlBytes = "<xml>Your XML data here</xml>".getBytes();
        signature.update(xmlBytes);
        byte[] signatureValue = signature.sign();
        xmlSignature.setSignatureValue(signatureValue);

        // Print the XML signature
        System.out.println(xmlSignature.toString());
    }
}
