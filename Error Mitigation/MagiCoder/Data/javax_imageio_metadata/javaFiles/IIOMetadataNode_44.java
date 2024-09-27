import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_44 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setNodeValue("Hello");
        System.out.println(node.getNodeValue());
    }
}
