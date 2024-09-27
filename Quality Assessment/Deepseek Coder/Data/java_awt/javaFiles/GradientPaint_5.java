import java.awt.Color;
import java.awt.GradientPaint;

public class GradientPaint_5 {
    public static void main(String[] args) {
        // Create a GradientPaint object
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.RED, 100, 100, Color.BLUE);
        
        // Get the first color in the gradient
        Color color1 = gradientPaint.getColor1();
        
        // Print the color
        System.out.println(color1);
    }
}
