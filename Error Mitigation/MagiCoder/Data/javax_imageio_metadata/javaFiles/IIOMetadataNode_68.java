import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.DOMException;

public class IIOMetadataNode_68 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        try {
            node.setUserData("key", "value", null);
            Object data = node.getUserData("key");
            System.out.println(data);
        } catch (DOMException e) {
            e.printStackTrace();
        }
    }
}
