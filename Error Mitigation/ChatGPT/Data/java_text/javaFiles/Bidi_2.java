import java.text.Bidi;

public class Bidi_2 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Sample text", Bidi.DIRECTION_LEFT_TO_RIGHT);
        int level = bidi.getLevelAt(2);
        System.out.println("Level at offset 2: " + level);
    }
}
