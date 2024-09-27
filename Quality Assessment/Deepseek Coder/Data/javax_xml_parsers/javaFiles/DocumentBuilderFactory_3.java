import javax.xml.parsers.DocumentBuilderFactory;

public class DocumentBuilderFactory_3 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        boolean isXIncludeSupported = dbf.getFeature("http://apache.org/xml/features/xinclude");
        System.out.println("Is XInclude Supported: " + isXIncludeSupported);
    }
}
