import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class IIOMetadataNode_67 {
    public static void main(String[] args) {
        try {
            BufferedImage img = ImageIO.read(new File("image.jpg"));
            IIOMetadata metadata = new IIOMetadata();
            IIOMetadataNode root = new IIOMetadataNode(metadata.getDefaultTreeElement());
            IIOMetadataNode node = new IIOMetadataNode("node");
            node.setAttribute("key", "value");
            root.appendChild(node);
            metadata.setFromTree(root);
            ImageWriter writer = ImageIO.getImageWritersByFormatName("jpg").next();
            ImageWriteParam param = writer.getDefaultWriteParam();
            writer.setOutput(ImageIO.createImageOutputStream(new File("output.jpg")));
            writer.write(null, new IIOImage(img, null, null), param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
