import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.metadata.IIOMetadata;

public class IIOMetadataNode_26 {
    public static void main(String[] args) {
        IIOMetadataNode root = new IIOMetadataNode("root");
        IIOMetadataNode child1 = new IIOMetadataNode("child1");
        IIOMetadataNode child2 = new IIOMetadataNode("child2");

        root.appendChild(child1);
        root.appendChild(child2);

        IIOMetadataNode newChild = new IIOMetadataNode("newChild");

        // Replace child2 with newChild
        root.replaceChild(newChild, child2);

        // Print the new child
        System.out.println(root.getFirstChild().getNextSibling().getNodeName());
    }
}
