import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class HyperlinkEvent_2 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane("text/html", "<a href=\"https://www.example.com\">Example</a>");
        editorPane.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    System.out.println(e.getURL());
                }
            }
        });
    }
}
