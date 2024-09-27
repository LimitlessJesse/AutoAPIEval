import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_18 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        IIOMetadataNode parentNode = new IIOMetadataNode("parentNode");
        parentNode.appendChild(node);
        
        IIOMetadataNode parent = node.getParentNode();
        if (parent!= null) {
            System.out.println("Parent node name: " + parent.getNodeName());
        } else {
            System.out.println("Node is the root of its own tree");
        }
    }
}
