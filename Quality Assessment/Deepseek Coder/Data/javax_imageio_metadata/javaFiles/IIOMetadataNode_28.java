import javax.imageio.metadata.IIOMetadataNode;
import org.w3c.dom.NodeList;

public class IIOMetadataNode_28 {
    public static void main(String[] args) {
        IIOMetadataNode root = new IIOMetadataNode("root");
        IIOMetadataNode child1 = new IIOMetadataNode("child");
        IIOMetadataNode child2 = new IIOMetadataNode("child");
        
        root.appendChild(child1);
        root.appendChild(child2);
        
        NodeList nodeList = root.getElementsByTagName("child");
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodeName());
        }
    }
}
