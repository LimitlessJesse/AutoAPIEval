import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_63 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("nodeName");
        String localName = node.getLocalName();
        System.out.println(localName);
    }
}
