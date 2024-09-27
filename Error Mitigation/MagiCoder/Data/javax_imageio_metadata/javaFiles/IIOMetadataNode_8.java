import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_8 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setAttribute("name", "value");
        String attributeValue = node.getAttribute("name");
        System.out.println(attributeValue);
    }
}
