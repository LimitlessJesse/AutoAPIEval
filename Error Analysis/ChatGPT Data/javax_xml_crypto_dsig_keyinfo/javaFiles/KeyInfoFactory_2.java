import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import java.util.Collections;

public class KeyInfoFactory_2 {
    public static void main(String[] args) {
        KeyInfoFactory keyInfoFactory = KeyInfoFactory.getInstance();
        KeyInfo keyInfo = keyInfoFactory.newKeyInfo(Collections.emptyList());
        System.out.println("New KeyInfo created: " + keyInfo);
    }
}
