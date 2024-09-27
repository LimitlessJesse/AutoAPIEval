import java.awt.Color;
import java.awt.GradientPaint;

public class GradientPaint_2 {
    public static void main(String[] args) {
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.RED, 10, 10, Color.BLUE);
        Color color2 = gradientPaint.getColor2();
        System.out.println("Color2: " + color2);
    }
}
