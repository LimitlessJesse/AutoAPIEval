import java.awt.Color;
import java.awt.MultipleGradientPaint;
import java.awt.Point2D;

public class MultipleGradientPaint_1 {
    public static void main(String[] args) {
        // Create a MultipleGradientPaint object
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
        float[] fractions = {0.0f, 0.5f, 1.0f};
        Point2D[] points = {new Point2D.Float(0, 0), new Point2D.Float(100, 100), new Point2D.Float(200, 200)};
        MultipleGradientPaint paint = new MultipleGradientPaint(points, fractions, colors);

        // Get the fractions
        float[] result = paint.getFractions();

        // Print the fractions
        for (float f : result) {
            System.out.println(f);
        }
    }
}
