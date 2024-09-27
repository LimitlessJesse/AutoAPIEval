import javax.xml.transform.dom.DOMResult;

public class DOMResult_2 {
    public static void main(String[] args) {
        DOMResult domResult = new DOMResult();
        domResult.setSystemId("http://example.com");
        System.out.println("System ID set: " + domResult.getSystemId());
    }
}
