import java.awt.Color;
import java.awt.GradientPaint;

public class GradientPaint_1 {
    public static void main(String[] args) {
        GradientPaint gradientPaint = new GradientPaint(0, 0, Color.RED, 10, 10, Color.BLUE);
        Color color1 = gradientPaint.getColor1();
        
        System.out.println("Color 1: " + color1);
    }
}
