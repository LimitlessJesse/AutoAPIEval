import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.NodeList;

public class IIOMetadataNode_48 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("root");
        node.setAttribute("attr", "value");
        IIOMetadataNode child = new IIOMetadataNode("child");
        node.appendChild(child);

        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            System.out.println(childNodes.item(i).getNodeName());
        }
    }
}
