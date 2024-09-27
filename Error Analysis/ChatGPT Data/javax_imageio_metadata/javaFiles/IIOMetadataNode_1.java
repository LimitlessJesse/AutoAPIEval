import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_1 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("Node");
        Object userObject = new Object();
        node.setUserObject(userObject);
        System.out.println("User object set successfully!");
    }
}
