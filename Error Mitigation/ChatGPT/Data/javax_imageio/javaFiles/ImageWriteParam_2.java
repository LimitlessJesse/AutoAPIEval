import javax.imageio.ImageWriteParam;

public class ImageWriteParam_2 {
    public static void main(String[] args) {
        ImageWriteParam param = new ImageWriteParam(null);
        int compressionMode = param.getCompressionMode();
        System.out.println("Compression Mode: " + compressionMode);
    }
}
