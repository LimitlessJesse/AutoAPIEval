import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_45 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setNodeValue("nodeValue");
        String nodeValue = node.getNodeValue();
        System.out.println(nodeValue);
    }
}
