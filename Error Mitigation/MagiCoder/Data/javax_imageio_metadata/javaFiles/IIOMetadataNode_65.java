import javax.imageio.metadata.IIOMetadataNode;

public class IIOMetadataNode_65 {
    public static void main(String[] args) {
        IIOMetadataNode node = new IIOMetadataNode();
        boolean isSupported = node.isSupported("feature", "version");
        System.out.println("Is feature supported: " + isSupported);
    }
}
