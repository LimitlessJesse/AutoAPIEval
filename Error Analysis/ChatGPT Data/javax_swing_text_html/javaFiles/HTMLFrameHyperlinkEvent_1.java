import javax.swing.text.html.HTMLFrameHyperlinkEvent;

public class HTMLFrameHyperlinkEvent_1 {
    public static void main(String[] args) {
        HTMLFrameHyperlinkEvent event = new HTMLFrameHyperlinkEvent("source", "target");
        String target = event.getTarget();
        System.out.println("Target: " + target);
    }
}
