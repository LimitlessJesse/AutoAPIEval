import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StyledEditorKit_ForegroundAction_5 {
    public static void main(String[] args) {
        
    }

    public void actionPerformed(ActionEvent e) {
        StyledEditorKit.ForegroundAction foregroundAction = new StyledEditorKit.ForegroundAction("Foreground", null);
        foregroundAction.actionPerformed(e);
    }
}
