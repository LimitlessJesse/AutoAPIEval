import javax.swing.JSpinner;
import javax.swing.JComponent;

public class JSpinner_4 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        JComponent editor = spinner.getEditor();
        System.out.println(editor);
    }
}
