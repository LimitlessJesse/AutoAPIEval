import javax.imageio.ImageIO;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;

public class IIOMetadataNode_2 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image_file");
            ImageInputStream in = ImageIO.createImageInputStream(file);
            IIOMetadata metadata = ImageIO.readMetadata(in);
            IIOMetadataNode root = (IIOMetadataNode) metadata.getAsTree("javax.imageio.metadata.documents");
            IIOMetadataNode node = (IIOMetadataNode) root.getFirstChild();
            Object userObject = node.getUserObject();
            System.out.println(userObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
