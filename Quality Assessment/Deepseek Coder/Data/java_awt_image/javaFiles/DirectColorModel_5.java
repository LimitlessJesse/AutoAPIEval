import java.awt.image.DirectColorModel;

public class DirectColorModel_5 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0xFF0000, 0xFF00, 0xFF);
        int pixel = 0xFF00FF00;
        int alpha = dcm.getAlpha(pixel);
        System.out.println("Alpha value of the pixel is: " + alpha);
    }
}
