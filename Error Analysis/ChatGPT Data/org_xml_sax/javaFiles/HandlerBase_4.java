import org.xml.sax.HandlerBase;

public class HandlerBase_4 {
    public static void main(String[] args) {
        HandlerBase handler = new HandlerBase();
        handler.processingInstruction("target", "data");
    }
}
