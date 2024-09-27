import org.xml.sax.ext.Locator2Impl;

public class Locator2Impl_2 {
    public static void main(String[] args) {
        Locator2Impl locator = new Locator2Impl();
        String encoding = locator.getEncoding();
        System.out.println("Encoding: " + encoding);
    }
}
