import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_58 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setAttribute("attribute", "value");
        System.out.println(node.hasAttributes()); // Outputs: true
    }
}
