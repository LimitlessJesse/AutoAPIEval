import java.awt.Color;

public class Color_2 {
    public static void main(String[] args) {
        Color color = new Color(100, 150, 200);
        int greenComponent = color.getGreen();
        System.out.println("Green component: " + greenComponent);
    }
}
