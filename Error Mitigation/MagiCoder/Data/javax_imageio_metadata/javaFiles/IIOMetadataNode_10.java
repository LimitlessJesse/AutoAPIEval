import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_10 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        node.setAttributeNS("namespaceURI", "localName", "value");
        String attribute = node.getAttributeNS("namespaceURI", "localName");
        System.out.println(attribute);
    }
}
