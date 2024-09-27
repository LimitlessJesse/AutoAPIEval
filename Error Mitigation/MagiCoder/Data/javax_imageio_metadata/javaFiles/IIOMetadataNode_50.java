import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_50 {
    public static void main(String[] args) {
        IIOMetadataNode root = new IIOMetadataNode("root");
        IIOMetadataNode child1 = new IIOMetadataNode("child1");
        IIOMetadataNode child2 = new IIOMetadataNode("child2");

        root.appendChild(child1);
        root.appendChild(child2);

        IIOMetadataNode lastChild = root.getLastChild();
        System.out.println(lastChild.getNodeName());  // Outputs: child2
    }
}
