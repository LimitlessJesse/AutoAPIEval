import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_9 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("root");
        node.setPrefix("prefix");
        System.out.println(node.getPrefix());
    }
}
