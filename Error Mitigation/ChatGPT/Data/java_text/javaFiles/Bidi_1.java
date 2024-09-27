import java.text.Bidi;

public class Bidi_1 {
    public static void main(String[] args) {
        Bidi bidi = new Bidi("Hello World", Bidi.DIRECTION_LEFT_TO_RIGHT);
        int length = bidi.getLength();
        System.out.println("Length of text in the line: " + length);
    }
}
