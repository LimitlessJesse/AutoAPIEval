import java.text.Bidi;

public class Bidi_4 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Sample text", Bidi.DIRECTION_LEFT_TO_RIGHT);
        int runLevel = bidi.getRunLevel(0);
        System.out.println("Run level: " + runLevel);
    }
}
