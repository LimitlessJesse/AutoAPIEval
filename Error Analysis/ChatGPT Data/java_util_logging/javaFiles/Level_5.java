import java.util.logging.Level;

public class Level_5 {
    public static void main(String[] args) {
        Level level1 = Level.INFO;
        Level level2 = Level.WARNING;
        
        boolean isEqual = level1.equals(level2);
        System.out.println(isEqual);
    }
}
