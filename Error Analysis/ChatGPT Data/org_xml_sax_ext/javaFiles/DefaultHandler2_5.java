import org.xml.sax.ext.DefaultHandler2;

public class DefaultHandler2_5 extends DefaultHandler2 {
    public void startEntity(String name) {
        System.out.println("Start entity: " + name);
    }

    public static void main(String[] args) {
        Main handler = new Main();
        String entityName = "exampleEntity";
        handler.startEntity(entityName);
    }
}
