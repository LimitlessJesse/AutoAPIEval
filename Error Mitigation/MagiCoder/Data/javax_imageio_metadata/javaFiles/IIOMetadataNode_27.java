import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.metadata.IIOMetadata;

public class IIOMetadataNode_27 {
    public static void main(String[] args) {
        IIOMetadataNode root = new IIOMetadataNode("root");
        IIOMetadataNode child = new IIOMetadataNode("child");
        root.appendChild(child);
        root.removeChild(child);
    }
}
