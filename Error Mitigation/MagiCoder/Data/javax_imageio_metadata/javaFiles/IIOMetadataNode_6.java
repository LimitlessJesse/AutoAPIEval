import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_6 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setUserObject(new Object());
        Object userObject = node.getUserObject();
        System.out.println(userObject);
    }
}
