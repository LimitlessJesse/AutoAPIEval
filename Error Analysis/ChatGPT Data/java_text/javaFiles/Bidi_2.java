import java.text.Bidi;

public class Bidi_2 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Hello", Bidi.DIRECTION_DEFAULT_LEFT_TO_RIGHT);
        int runLevel = bidi.getRunLevel(0);
        System.out.println("Run Level: " + runLevel);
    }
}
