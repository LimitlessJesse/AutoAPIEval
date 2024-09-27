import java.awt.Dimension;

public class Dimension_5 {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(100, 200);
        System.out.println("Before setting size: " + dimension);

        setSize(dimension, 300, 400);
        System.out.println("After setting size: " + dimension);
    }

    public static void setSize(Dimension d, int width, int height) {
        d.setSize(width, height);
    }
}
