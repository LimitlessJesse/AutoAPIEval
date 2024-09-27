import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_13 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setNodeValue("Hello, World!");
        System.out.println(node.getNodeValue());
    }
}
