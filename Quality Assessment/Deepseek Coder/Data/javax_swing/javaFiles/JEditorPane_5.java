import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.net.URL;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class JEditorPane_5 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JEditorPane editorPane = new JEditorPane("text/html", "");
                    editorPane.setEditable(false);

                    // Add a HyperlinkListener to the editor pane
                    editorPane.addHyperlinkListener(new HyperlinkListener() {
                        public void hyperlinkUpdate(HyperlinkEvent e) {
                            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                                try {
                                    editorPane.setPage(e.getURL());
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }
                        }
                    });

                    // Set the content pane of the frame to the editor pane
                    javax.swing.JFrame frame = new javax.swing.JFrame();
                    frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                    frame.getContentPane().add(BorderLayout.CENTER, editorPane);
                    frame.setSize(300, 300);
                    frame.setVisible(true);

                    // Load a URL into the editor pane
                    editorPane.setPage("http://www.google.com");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
