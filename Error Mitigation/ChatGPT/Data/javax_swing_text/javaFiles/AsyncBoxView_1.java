import javax.swing.text.AsyncBoxView;
import javax.swing.text.View;

public class AsyncBoxView_1 {
    public static void main(String[] args) {
        AsyncBoxView asyncBoxView = new AsyncBoxView(null);
        View parentView = new View(null);
        asyncBoxView.setParent(parentView);
    }
}
