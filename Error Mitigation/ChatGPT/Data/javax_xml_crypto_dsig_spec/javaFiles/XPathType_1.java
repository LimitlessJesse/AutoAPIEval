import javax.xml.crypto.dsig.spec.XPathType;

public class XPathType_1 {
    public static void main(String[] args) {
        XPathType xPathType = new XPathType("exampleXPathExpression");
        String expression = xPathType.getExpression();
        System.out.println("XPath Expression: " + expression);
    }
}
