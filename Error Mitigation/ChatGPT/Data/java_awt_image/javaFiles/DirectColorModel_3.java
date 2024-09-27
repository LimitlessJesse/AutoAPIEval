import java.awt.image.DirectColorModel;

public class DirectColorModel_3 {
    public static void main(String[] args) {
        DirectColorModel colorModel = new DirectColorModel(32, 16711680, 65280, 255, -16777216);
        int pixel = colorModel.getDataElement(255, null);
        int blue = colorModel.getBlue(pixel);
        System.out.println("Blue color component for the specified pixel: " + blue);
    }
}
