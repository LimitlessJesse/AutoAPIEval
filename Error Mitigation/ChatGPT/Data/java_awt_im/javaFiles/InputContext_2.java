import java.awt.im.InputContext;

public class InputContext_2 {
    public static void main(String[] args) {
        InputContext inputContext = InputContext.getInstance();
        if (inputContext != null) {
            inputContext.reconvert();
        } else {
            throw new UnsupportedOperationException("No current input method available");
        }
    }
}
