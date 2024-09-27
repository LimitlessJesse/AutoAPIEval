import java.awt.Color;

public class Color_9 {
    public static void main(String[] args) {
        Color color = new Color(100, 150, 200, 220);
        int alpha = color.getAlpha();
        System.out.println("Alpha: " + alpha);
    }
}
