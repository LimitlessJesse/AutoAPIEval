import java.text.Bidi;

public class Bidi_3 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Hello", 0);
        int runLimit = bidi.getRunLimit(0);
        System.out.println("Run limit at index 0: " + runLimit);
    }
}
