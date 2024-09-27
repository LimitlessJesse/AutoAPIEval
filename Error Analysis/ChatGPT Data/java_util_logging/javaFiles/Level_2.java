import java.util.logging.Level;

public class Level_2 {
    public static void main(String[] args) {
        Level level = Level.parse("INFO");
        System.out.println("Parsed Level: " + level);
    }
}
