import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_1 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setUserObject("userObject");
        System.out.println(node.getUserObject());
    }
}
