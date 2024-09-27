import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_3 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("nodeName");
        node.setAttribute("attributeName", "attributeValue");
        System.out.println(node.getAttributes());
    }
}
