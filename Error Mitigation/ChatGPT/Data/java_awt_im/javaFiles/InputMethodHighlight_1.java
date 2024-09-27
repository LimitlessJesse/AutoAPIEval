import java.awt.im.InputMethodHighlight;

public class InputMethodHighlight_1 {
    public static void main(String[] args) {
        InputMethodHighlight highlight = new InputMethodHighlight();
        int state = highlight.getState();
        System.out.println("Conversion state: " + state);
    }
}
