import java.awt.Dimension;
import java.awt.Toolkit;

public class Toolkit_2 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        System.out.println("Screen width: " + width);
        System.out.println("Screen height: " + height);
    }
}
