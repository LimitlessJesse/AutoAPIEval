import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_51 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        IIOMetadataNode sibling = new IIOMetadataNode("sibling");
        node.appendChild(sibling);

        IIOMetadataNode previousSibling = (IIOMetadataNode) node.getPreviousSibling();
        if (previousSibling!= null) {
            System.out.println(previousSibling.getNodeName());
        } else {
            System.out.println("No previous sibling");
        }
    }
}
