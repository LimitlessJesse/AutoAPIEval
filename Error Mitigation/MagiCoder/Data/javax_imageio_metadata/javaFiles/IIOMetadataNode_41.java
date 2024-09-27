import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_41 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("nodeName");
        String nodeName = node.getNodeName();
        System.out.println("Node Name: " + nodeName);
    }
}
