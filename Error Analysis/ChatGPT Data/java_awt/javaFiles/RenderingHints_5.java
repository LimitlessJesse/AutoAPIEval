import java.awt.RenderingHints;

public class RenderingHints_5 {
    public static void main(String[] args) {
        RenderingHints hints = new RenderingHints(null);
        hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        hints.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        System.out.println("Before clearing: " + hints);

        hints.clear();

        System.out.println("After clearing: " + hints);
    }
}
