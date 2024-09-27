import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import java.util.Collections;
import java.util.List;

public class KeyInfoFactory_4 {
    public static void main(String[] args) {
        KeyInfoFactory keyInfoFactory = KeyInfoFactory.getInstance();
        List content = Collections.emptyList();
        X509Data x509Data = keyInfoFactory.newX509Data(content);
    }
}
