import javax.swing.text.DefaultEditorKit;
import javax.swing.text.View;

public class View_2 {
    public static void main(String[] args) {
        View view = new DefaultEditorKit.LeftAction();
        int endOffset = view.getEndOffset();
        System.out.println("End Offset: " + endOffset);
    }
}
