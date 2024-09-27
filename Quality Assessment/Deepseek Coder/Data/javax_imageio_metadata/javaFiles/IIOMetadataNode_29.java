import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.NodeList;

public class IIOMetadataNode_29 {
    public static void main(String[] args) {
        IIOMetadataNode root = new IIOMetadataNode("root");
        IIOMetadataNode child = new IIOMetadataNode("child");
        root.appendChild(child);

        String namespaceURI = "http://example.com";
        String localName = "child";

        NodeList nodeList = root.getElementsByTagNameNS(namespaceURI, localName);

        for (int i = 0; i < nodeList.getLength(); i++) {
            IIOMetadataNode node = (IIOMetadataNode) nodeList.item(i);
            System.out.println(node.getNodeName());
        }
    }
}
