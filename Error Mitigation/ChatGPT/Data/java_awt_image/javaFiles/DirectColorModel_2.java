import java.awt.image.DirectColorModel;

public class DirectColorModel_2 {
    public static void main(String[] args) {
        DirectColorModel colorModel = new DirectColorModel(32, 16711680, 65280, 255, -16777216);
        int pixel = colorModel.getDataElement(255, null);
        int green = colorModel.getGreen(pixel);
        System.out.println("Green color component for the specified pixel: " + green);
    }
}
