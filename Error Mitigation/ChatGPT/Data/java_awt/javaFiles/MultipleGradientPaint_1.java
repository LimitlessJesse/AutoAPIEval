import java.awt.Color;
import java.awt.MultipleGradientPaint;

public class MultipleGradientPaint_1 {
    public static void main(String[] args) {
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        float[] fractions = {0.0f, 0.5f, 1.0f};
        
        MultipleGradientPaint paint = new MultipleGradientPaint(colors, fractions);
        Color[] gradientColors = paint.getColors();
        
        for (Color color : gradientColors) {
            System.out.println(color);
        }
    }
}
