import java.awt.Dimension;

public class Dimension_4 {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(100, 200);
        Dimension size = dimension.getSize();
        System.out.println("Width: " + size.width + ", Height: " + size.height);
    }
}
