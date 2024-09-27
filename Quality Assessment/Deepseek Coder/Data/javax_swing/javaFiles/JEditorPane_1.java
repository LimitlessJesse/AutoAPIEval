import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class JEditorPane_1 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();

        editorPane.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    System.out.println("Link clicked: " + e.getURL());
                }
            }
        });

        editorPane.setText("<html>Click <a href='https://www.example.com'>here</a> to visit Example.com</html>");
    }
}
