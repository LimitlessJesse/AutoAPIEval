import javax.imageio.metadata.IIOMetadata;
import org.w3c.dom.Node;

public class IIOMetadata_2 {
    public static void main(String[] args) {
        IIOMetadata metadata = null; // initialize IIOMetadata object
        
        // Call getAsTree method
        Node rootNode = metadata.getAsTree("formatName");
        
        // Use the rootNode as needed
    }
}
