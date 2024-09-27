import org.xml.sax.HandlerBase;

public class HandlerBase_3 extends HandlerBase {
    public static void main(String[] args) {
        Main handler = new Main();
        handler.endElement("element");
    }

    public void endElement(String name) {
        System.out.println("End of element: " + name);
    }
}
