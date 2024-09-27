import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.CertStore;
import java.security.cert.CertStoreParameters;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class CertPath_7 {
    public static void main(String[] args) {
        try {
            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            FileInputStream fis = new FileInputStream("path_to_your_certificate_file");
            Certificate cert = cf.generateCertificate(fis);
            X509Certificate x509Cert = (X509Certificate) cert;

            CertPath certPath = x509Cert.getCertPath();
            byte[] encoded = certPath.getEncoded();

            System.out.println(Arrays.toString(encoded));
        } catch (CertificateException | IOException e) {
            e.printStackTrace();
        }
    }
}
