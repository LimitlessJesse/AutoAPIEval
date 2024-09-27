import java.awt.MultipleGradientPaint;

public class MultipleGradientPaint_2 {
    public static void main(String[] args) {
        // Create a MultipleGradientPaint object
        MultipleGradientPaint paint = new MultipleGradientPaint() {
            @Override
            public float[] getFractions() {
                return new float[]{0.0f, 0.5f, 1.0f};
            }
        };

        // Get the fractions array
        float[] fractions = paint.getFractions();

        // Print the fractions array
        for (float fraction : fractions) {
            System.out.println(fraction);
        }
    }
}
