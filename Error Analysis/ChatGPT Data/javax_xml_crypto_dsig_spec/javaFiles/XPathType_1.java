import javax.xml.crypto.dsig.spec.XPathType;

public class XPathType_1 {
    public static void main(String[] args) {
        XPathType xPathType = new XPathType("expression");
        String expression = xPathType.getExpression();
        System.out.println(expression);
    }
}
