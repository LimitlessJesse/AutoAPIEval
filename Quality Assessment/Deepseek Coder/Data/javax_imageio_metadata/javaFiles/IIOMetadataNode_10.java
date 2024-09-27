import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_10 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setPrefix("prefix");
        System.out.println(node.getPrefix());
    }
}
