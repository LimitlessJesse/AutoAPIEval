import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_5 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setUserObject("Hello, World!");
        System.out.println(node.getUserObject());
    }
}
