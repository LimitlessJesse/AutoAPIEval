import java.awt.Insets;

public class Insets_5 {
    public static void main(String[] args) {
        Insets insets = new Insets(10, 20, 30, 40);
        insets.set(5, 15, 25, 35);
        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
