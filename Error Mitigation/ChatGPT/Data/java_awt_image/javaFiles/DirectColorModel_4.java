import java.awt.image.DirectColorModel;

public class DirectColorModel_4 {
    public static void main(String[] args) {
        DirectColorModel colorModel = new DirectColorModel(32, 0x00ff0000, 0x0000ff00, 0x000000ff, 0xff000000);
        int pixel = 0xffaabbcc; // Example pixel value
        int alpha = colorModel.getAlpha(pixel);
        System.out.println("Alpha value of pixel: " + alpha);
    }
}
