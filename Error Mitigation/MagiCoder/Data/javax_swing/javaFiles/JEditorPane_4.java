import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class JEditorPane_4 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    System.out.println("Link activated: " + e.getURL());
                }
            }
        });
    }
}
