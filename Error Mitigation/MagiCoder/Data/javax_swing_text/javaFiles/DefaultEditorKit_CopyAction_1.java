import javax.swing.text.DefaultEditorKit;
import javax.swing.text.JTextComponent;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_CopyAction_1 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextComponent() {
            // Implement JTextComponent methods here
        };

        DefaultEditorKit.CopyAction copyAction = new DefaultEditorKit.CopyAction();
        copyAction.actionPerformed(new ActionEvent(textComponent, 0, "copy"));

        // Get the system clipboard
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        // Get the data from the clipboard
        try {
            String data = (String) clipboard.getData(DataFlavor.stringFlavor);
            System.out.println("Copied data: " + data);
        } catch (UnsupportedFlavorException | IOException e) {
            e.printStackTrace();
        }
    }
}
