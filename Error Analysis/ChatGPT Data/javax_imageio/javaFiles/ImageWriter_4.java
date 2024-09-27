import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.metadata.IIOMetadata;

public class ImageWriter_4 {
    public static void main(String[] args) {
        ImageWriteParam param = ImageIO.getImageWritersByFormatName("jpg").next().getDefaultWriteParam();
        IIOMetadata streamMetadata = ImageIO.getImageWritersByFormatName("jpg").next().getDefaultStreamMetadata(param);
        System.out.println(streamMetadata);
    }
}
