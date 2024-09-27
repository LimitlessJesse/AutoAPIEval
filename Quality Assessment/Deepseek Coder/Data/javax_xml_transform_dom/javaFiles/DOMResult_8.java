import javax.xml.transform.dom.DOMResult;

public class DOMResult_8 {
    public static void main(String[] args) {
        DOMResult domResult = new DOMResult();
        domResult.setSystemId("systemId");
        System.out.println(domResult.getSystemId());
    }
}
