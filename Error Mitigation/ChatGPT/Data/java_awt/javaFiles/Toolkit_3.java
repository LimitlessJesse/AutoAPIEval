import java.awt.Toolkit;
import java.awt.HeadlessException;
import java.awt.image.ColorModel;

public class Toolkit_3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        try {
            ColorModel colorModel = toolkit.getColorModel();
            System.out.println("Color Model: " + colorModel);
        } catch (HeadlessException e) {
            System.out.println("HeadlessException occurred: " + e.getMessage());
        }
    }
}
