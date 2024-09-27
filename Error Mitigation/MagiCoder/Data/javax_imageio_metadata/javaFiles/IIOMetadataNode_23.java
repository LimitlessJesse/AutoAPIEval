import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_23 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode("node");
        IIOMetadataNode nextSibling = node.getNextSibling();
        if (nextSibling!= null) {
            System.out.println("The next sibling is: " + nextSibling.getNodeName());
        } else {
            System.out.println("The node has no next sibling.");
        }
    }
}
