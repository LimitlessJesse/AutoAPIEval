import java.awt.Color;
import java.awt.GradientPaint;

public class GradientPaint_3 {
    public static void main(String[] args) {
        // Create a GradientPaint object
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.BLUE, 100, 100, Color.RED);

        // Get the color anchored by the point P1
        Color color1 = gradientPaint.getColor1();

        // Print the color
        System.out.println("Color 1: " + color1);
    }
}
