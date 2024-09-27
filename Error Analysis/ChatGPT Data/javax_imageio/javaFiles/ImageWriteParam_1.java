import javax.imageio.ImageWriteParam;

public class ImageWriteParam_1 {
    public static void main(String[] args) {
        ImageWriteParam param = new ImageWriteParam(null);
        param.setCompressionMode(ImageWriteParam.MODE_COPY_FROM_METADATA);
        System.out.println("Compression mode set to: " + param.getCompressionMode());
    }
}
