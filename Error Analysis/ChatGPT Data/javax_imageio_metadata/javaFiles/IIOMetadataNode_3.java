import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_3 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("metadata");
        node.setAttribute("key", "value");
        System.out.println(node.getAttribute("key"));
    }
}
