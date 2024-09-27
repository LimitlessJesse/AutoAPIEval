import java.awt.image.DirectColorModel;

public class DirectColorModel_2 {
    public static void main(String[] args) {
        // Create a DirectColorModel object
        DirectColorModel dcm = new DirectColorModel(24, 0x00FF0000, 0x0000FF00, 0x000000FF);

        // Get the green component value from a pixel
        int pixel = 0xFF00FF;
        int green = dcm.getGreen(pixel);

        System.out.println("Green component value: " + green);
    }
}
