import java.util.logging.Level;

public class Level_3 {
    public static void main(String[] args) {
        Level level1 = Level.INFO;
        Level level2 = Level.WARNING;

        boolean result1 = level1.equals(level2);
        boolean result2 = level1.equals(Level.INFO);

        System.out.println("Result 1: " + result1); // Output: false
        System.out.println("Result 2: " + result2); // Output: true
    }
}
