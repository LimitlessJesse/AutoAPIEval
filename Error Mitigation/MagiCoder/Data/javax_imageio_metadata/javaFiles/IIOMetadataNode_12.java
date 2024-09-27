import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.DOMException;

public class IIOMetadataNode_12 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode();
        try {
            node.getTextContent();
        } catch (DOMException e) {
            e.printStackTrace();
        }
    }
}
