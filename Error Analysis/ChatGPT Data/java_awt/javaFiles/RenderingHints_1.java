import java.awt.RenderingHints;

public class RenderingHints_1 {
    public static void main(String[] args) {
        RenderingHints hints = new RenderingHints(null);
        hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        Object value = hints.get(RenderingHints.KEY_ANTIALIASING);
        System.out.println(value);
    }
}
