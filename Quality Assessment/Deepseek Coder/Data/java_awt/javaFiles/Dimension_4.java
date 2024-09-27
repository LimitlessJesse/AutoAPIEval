import java.awt.Dimension;
import java.awt.Toolkit;

public class Dimension_4 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Screen size: " + screenSize);

        Dimension newSize = new Dimension(800, 600);
        screenSize.setSize(newSize);

        System.out.println("New screen size: " + screenSize);
    }
}
