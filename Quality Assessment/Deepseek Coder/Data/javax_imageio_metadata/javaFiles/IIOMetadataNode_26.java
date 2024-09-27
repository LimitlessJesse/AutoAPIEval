import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_26 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("root");
        IIOMetadataNode clone = (IIOMetadataNode) node.cloneNode(true);
        System.out.println(clone);
    }
}
