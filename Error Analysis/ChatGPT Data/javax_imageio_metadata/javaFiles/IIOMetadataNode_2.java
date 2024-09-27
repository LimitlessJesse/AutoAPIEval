import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_2 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("root");
        IIOMetadataNode userObject = (IIOMetadataNode) node.getUserObject();
        System.out.println(userObject);
    }
}
