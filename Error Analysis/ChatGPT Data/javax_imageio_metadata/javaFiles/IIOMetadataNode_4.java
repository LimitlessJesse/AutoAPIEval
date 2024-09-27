import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_4 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("metadataNode");
        node.setAttribute("key1", "value1");
        String value = node.getAttribute("key1");
        System.out.println("Value for key1: " + value);
    }
}
