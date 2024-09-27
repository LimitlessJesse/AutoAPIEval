import javax.swing.text.AsyncBoxView;

public class AsyncBoxView_4 {
    public static void main(String[] args) {
        AsyncBoxView asyncBoxView = new AsyncBoxView(null);
        float preferredSpanX = asyncBoxView.getPreferredSpan(AsyncBoxView.X_AXIS);
        float preferredSpanY = asyncBoxView.getPreferredSpan(AsyncBoxView.Y_AXIS);
        System.out.println("Preferred Span X: " + preferredSpanX);
        System.out.println("Preferred Span Y: " + preferredSpanY);
    }
}
