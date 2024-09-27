import java.awt.Color;
import java.awt.GradientPaint;

public class GradientPaint_4 {
    public static void main(String[] args) {
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.BLUE, 100, 100, Color.RED);
        Color color2 = gradientPaint.getColor2();
        System.out.println(color2);
    }
}
