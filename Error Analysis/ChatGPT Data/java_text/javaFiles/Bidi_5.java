import java.text.Bidi;

public class Bidi_5 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Hello", Bidi.DIRECTION_LEFT_TO_RIGHT);
        boolean mixed = bidi.isMixed();
        System.out.println("Is mixed: " + mixed);
    }
}
