import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_33 {
    public static void main(String[] args) {
        IIOMetadataNode parentNode = new IIOMetadataNode("parent");
        IIOMetadataNode currentNode = new IIOMetadataNode("current");
        IIOMetadataNode nextSiblingNode = new IIOMetadataNode("nextSibling");

        parentNode.appendChild(currentNode);
        parentNode.appendChild(nextSiblingNode);

        IIOMetadataNode nextNode = currentNode.getNextSibling();
        if (nextNode!= null) {
            System.out.println("Next sibling node: " + nextNode.getNodeName());
        } else {
            System.out.println("No next sibling node");
        }
    }
}
