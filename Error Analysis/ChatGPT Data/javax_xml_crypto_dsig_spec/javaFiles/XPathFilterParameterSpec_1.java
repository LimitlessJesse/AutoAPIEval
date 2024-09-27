import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;

public class XPathFilterParameterSpec_1 {
    public static void main(String[] args) {
        XPathFilterParameterSpec spec = new XPathFilterParameterSpec("xpathExpression");
        String xpath = spec.getXPath();
        System.out.println("XPath: " + xpath);
    }
}
