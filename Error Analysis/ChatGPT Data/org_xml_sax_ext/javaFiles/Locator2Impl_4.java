import org.xml.sax.ext.Locator2Impl;

public class Locator2Impl_4 {
    public static void main(String[] args) {
        Locator2Impl locator = new Locator2Impl();
        String xmlVersion = locator.getXMLVersion();
        System.out.println("XML Version: " + xmlVersion);
    }
}
