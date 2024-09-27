import java.text.Bidi;

public class Bidi_3 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Sample Text", Bidi.DIRECTION_LEFT_TO_RIGHT);
        int runCount = bidi.getRunCount();
        System.out.println("Number of level runs: " + runCount);
    }
}
