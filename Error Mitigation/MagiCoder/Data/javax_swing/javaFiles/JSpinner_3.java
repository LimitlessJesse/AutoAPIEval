import javax.swing.JSpinner;
import javax.swing.JComponent;
import javax.swing.SpinnerNumberModel;

public class JSpinner_3 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        JComponent editor = spinner.getEditor();
        spinner.setEditor(editor);
    }
}
