import java.awt.Color;

public class Color_5 {
    public static void main(String[] args) {
        Color color = new Color(100, 150, 200);
        Color brighterColor = color.brighter();
        System.out.println("Original Color: " + color);
        System.out.println("Brighter Color: " + brighterColor);
    }
}
