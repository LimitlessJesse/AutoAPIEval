import javax.imageio.ImageIO;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.ImageInputStream;
import java.io.File;
import java.io.IOException;

public class IIOMetadataNode_16 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_image_file");
            ImageInputStream in = ImageIO.createImageInputStream(file);
            IIOMetadata metadata = ImageIO.readMetadata(in, "jpeg");
            IIOMetadataNode root = (IIOMetadataNode) metadata.getAsTree("javax_imageio_1.0");
            IIOMetadataNode textNode = (IIOMetadataNode) root.getFirstChild().getNextSibling();
            String textContent = textNode.getTextContent();
            System.out.println(textContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
