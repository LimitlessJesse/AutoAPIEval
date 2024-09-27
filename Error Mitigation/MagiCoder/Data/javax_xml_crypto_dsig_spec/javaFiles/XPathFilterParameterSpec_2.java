import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;

public class XPathFilterParameterSpec_2 {
    public static void main(String[] args) {
        XPathFilterParameterSpec spec = new XPathFilterParameterSpec("//*[local-name()='element']");
        String xPath = spec.getXPath();
        System.out.println(xPath);
    }
}
