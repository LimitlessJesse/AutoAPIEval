import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_57 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("root");
        IIOMetadataNode clone = (IIOMetadataNode) node.cloneNode(true);
    }
}
