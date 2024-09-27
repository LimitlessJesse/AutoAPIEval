import java.awt.im.InputContext;
import java.awt.im.InputMethodHighlight;
import java.awt.im.InputSubset;

public class InputContext_3 {
    public static void main(String[] args) {
        InputContext inputContext = InputContext.getInstance();
        InputSubset[] subsets = {InputSubset.LATIN, InputSubset.DIGITS};
        inputContext.setCharacterSubsets(subsets);
    }
}
