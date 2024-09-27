import javax.imageio.ImageWriteParam;

public class ImageWriteParam_4 {
    public static void main(String[] args) {
        ImageWriteParam param = new ImageWriteParam(null);
        float compressionQuality = param.getCompressionQuality();
        System.out.println("Compression Quality: " + compressionQuality);
    }
}
