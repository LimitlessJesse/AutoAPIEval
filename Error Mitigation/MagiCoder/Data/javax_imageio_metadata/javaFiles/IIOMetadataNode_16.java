import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_16 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode();
        short nodeType = node.getNodeType();
        System.out.println("Node Type: " + nodeType);
    }
}
