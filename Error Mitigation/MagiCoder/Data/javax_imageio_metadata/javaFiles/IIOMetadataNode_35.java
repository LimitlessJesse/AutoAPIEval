import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.DOMException;

public class IIOMetadataNode_35 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode();
        try {
            node.getBaseURI();
        } catch (DOMException e) {
            e.printStackTrace();
        }
    }
}
