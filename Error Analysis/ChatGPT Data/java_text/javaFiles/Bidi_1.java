import java.text.Bidi;

public class Bidi_1 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Hello", Bidi.DIRECTION_LEFT_TO_RIGHT);
        int runCount = bidi.getRunCount();
        System.out.println("Run count: " + runCount);
    }
}
