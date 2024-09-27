import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_37 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setUserObject("Hello");
        System.out.println(node.getUserObject());
    }
}
