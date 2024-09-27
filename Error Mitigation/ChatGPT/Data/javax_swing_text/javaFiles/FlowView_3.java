import javax.swing.text.DocumentEvent;
import javax.swing.text.FlowView;
import javax.swing.text.ViewFactory;
import java.awt.Shape;

public class FlowView_3 {
    public static void main(String[] args) {
        FlowView flowView = new FlowView(null);
        DocumentEvent documentEvent = new DocumentEvent() {
            @Override
            public int getOffset() {
                return 0;
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public Document getDocument() {
                return null;
            }

            @Override
            public EventType getType() {
                return null;
            }
        };
        Shape shape = null;
        ViewFactory viewFactory = null;

        flowView.insertUpdate(documentEvent, shape, viewFactory);
    }
}
