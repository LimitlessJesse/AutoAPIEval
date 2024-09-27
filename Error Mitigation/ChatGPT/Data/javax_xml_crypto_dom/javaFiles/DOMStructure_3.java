import javax.xml.crypto.dom.DOMStructure;

public class DOMStructure_3 {
    public static void main(String[] args) {
        DOMStructure domStructure = new DOMStructure();
        String feature = "http://www.example.com/feature";
        boolean isSupported = domStructure.isFeatureSupported(feature);
        System.out.println("Is feature supported: " + isSupported);
    }
}
