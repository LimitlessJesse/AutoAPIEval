import java.awt.GradientPaint;

public class GradientPaint_5 {
    public static void main(String[] args) {
        GradientPaint gradient = new GradientPaint(0, 0, Color.RED, 100, 100, Color.BLUE);
        boolean isCyclic = gradient.isCyclic();
        System.out.println("Is cyclic: " + isCyclic);
    }
}
