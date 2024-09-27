import java.util.logging.Level;

public class Level_4 {
    public static void main(String[] args) {
        Level level = Level.INFO;
        int hashCode = level.hashCode();
        System.out.println("Hashcode for level " + level.getName() + ": " + hashCode);
    }
}
