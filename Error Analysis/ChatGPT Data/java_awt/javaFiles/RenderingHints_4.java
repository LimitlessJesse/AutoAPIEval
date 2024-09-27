import java.awt.RenderingHints;

public class RenderingHints_4 {
    public static void main(String[] args) {
        RenderingHints hints = new RenderingHints(null);
        hints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        boolean containsKey = hints.containsKey(RenderingHints.KEY_ANTIALIASING);
        System.out.println("Contains key: " + containsKey);
    }
}
