import java.awt.im.InputContext;

public class InputContext_3 {
    public static void main(String[] args) {
        InputContext inputContext = InputContext.getInstance();
        Character.Subset[] subsets = {Character.UnicodeBlock.BASIC_LATIN};
        inputContext.setCharacterSubsets(subsets);
    }
}
