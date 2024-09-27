import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

public class IIOMetadataNode_24 {
    public static void main(String[] args) {
        IIOMetadataNode root = new IIOMetadataNode("root");
        IIOMetadataNode child1 = new IIOMetadataNode("child1");
        IIOMetadataNode child2 = new IIOMetadataNode("child2");

        root.appendChild(child1);
        root.insertBefore(child2, child1);

        System.out.println(root.getChildNodes());
    }
}
