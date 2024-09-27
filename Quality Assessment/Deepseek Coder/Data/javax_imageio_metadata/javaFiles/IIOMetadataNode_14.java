import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_14 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setAttribute("name", "test");
        System.out.println(node.getLocalName());
    }
}
