import java.awt.Color;

public class Color_13 {
    public static void main(String[] args) {
        Color originalColor = new Color(100, 150, 200);
        System.out.println("Original color: " + originalColor);

        Color brighterColor = originalColor.brighter();
        System.out.println("Brighter color: " + brighterColor);
    }
}
