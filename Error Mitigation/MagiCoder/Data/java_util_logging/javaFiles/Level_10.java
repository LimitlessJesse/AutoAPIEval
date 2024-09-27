import java.util.logging.Level;

public class Level_10 {
    public static void main(String[] args) {
        try {
            Level level = Level.parse("SEVERE");
            System.out.println(level);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
