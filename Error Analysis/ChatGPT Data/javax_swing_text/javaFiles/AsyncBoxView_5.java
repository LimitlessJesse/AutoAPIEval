import javax.swing.text.AsyncBoxView;

public class AsyncBoxView_5 {
    public static void main(String[] args) {
        AsyncBoxView asyncBoxView = new AsyncBoxView(null);
        float minimumSpan = asyncBoxView.getMinimumSpan(0);
        System.out.println("Minimum span on axis 0: " + minimumSpan);
    }
}
