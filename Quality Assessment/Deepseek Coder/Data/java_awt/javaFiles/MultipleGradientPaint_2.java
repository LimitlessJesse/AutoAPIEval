import java.awt.*;

public class MultipleGradientPaint_2 {
    public static void main(String[] args) {
        // Create a color array
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};

        // Create a MultipleGradientPaint object
        MultipleGradientPaint paint = new MultipleGradientPaint(0, 0, colors, new float[]{0, 0.5f, 1}, true);

        // Get the colors from the paint
        Color[] paintColors = paint.getColors();

        // Print the colors
        for (Color color : paintColors) {
            System.out.println(color);
        }
    }
}
