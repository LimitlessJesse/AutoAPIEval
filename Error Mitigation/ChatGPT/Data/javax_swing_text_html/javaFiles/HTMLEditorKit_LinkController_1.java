import javax.swing.text.html.HTMLEditorKit;
import java.awt.event.MouseEvent;

public class HTMLEditorKit_LinkController_1 {
    public static void main(String[] args) {
        HTMLEditorKit.LinkController linkController = new HTMLEditorKit.LinkController();
        MouseEvent mouseEvent = new MouseEvent(null, 0, 0, 0, 0, 0, 0, false);
        linkController.mouseClicked(mouseEvent);
    }
}
