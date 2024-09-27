import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_20 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("root");
        IIOMetadataNode child = new IIOMetadataNode("child");
        node.appendChild(child);
        
        IIOMetadataNode firstChild = (IIOMetadataNode) node.getFirstChild();
        System.out.println(firstChild.getNodeName());  // Output: child
    }
}
