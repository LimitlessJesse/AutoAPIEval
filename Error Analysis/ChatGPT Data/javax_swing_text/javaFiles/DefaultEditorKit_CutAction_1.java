import javax.swing.text.DefaultEditorKit;
import java.awt.event.ActionEvent;

public class DefaultEditorKit_CutAction_1 {
    public static void main(String[] args) {
        
    }
    
    public void actionPerformed(ActionEvent e) {
        DefaultEditorKit.CutAction cutAction = new DefaultEditorKit.CutAction();
        cutAction.actionPerformed(e);
    }
}
