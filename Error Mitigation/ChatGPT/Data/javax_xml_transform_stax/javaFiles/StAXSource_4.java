import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.Source;

public class StAXSource_4 {
    public static void main(String[] args) {
        StAXSource staxSource = new StAXSource();
        String systemId = staxSource.getSystemId();
        System.out.println("System Identifier: " + systemId);
    }
}
