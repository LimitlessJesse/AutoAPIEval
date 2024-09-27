import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.metadata.IIOMetadataFormatImpl;

public class IIOMetadataNode_22 {
    public static void main(String[] args) {
        // Create a new IIOMetadataNode
        IIOMetadataNode root = new IIOMetadataFormatImpl().getRoot();

        // Add a child node
        IIOMetadataNode child = new IIOMetadataNode("child");
        root.appendChild(child);

        // Get child nodes
        NodeList nodeList = root.getChildNodes();

        // Print child nodes
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println(node.getNodeName());
        }
    }
}
