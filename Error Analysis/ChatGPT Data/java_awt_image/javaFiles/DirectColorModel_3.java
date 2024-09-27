import java.awt.image.DirectColorModel;

public class DirectColorModel_3 {
    public static void main(String[] args) {
        DirectColorModel colorModel = new DirectColorModel(24, 0xFF0000, 0xFF00, 0xFF);
        int pixel = 0xFF112233; // Example pixel value
        int blue = colorModel.getBlue(pixel);
        System.out.println("Blue component of the pixel: " + blue);
    }
}
