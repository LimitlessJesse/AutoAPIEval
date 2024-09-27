import javax.swing.text.html.BlockView;

public class BlockView_2 {
    public static void main(String[] args) {
        BlockView blockView = new BlockView(null, 0, 0, 0);
        float preferredSpan = blockView.getPreferredSpan(BlockView.X_AXIS);
        System.out.println("Preferred Span on X_AXIS: " + preferredSpan);
    }
}
