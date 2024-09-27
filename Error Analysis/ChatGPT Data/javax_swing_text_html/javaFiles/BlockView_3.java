import javax.swing.text.html.BlockView;

public class BlockView_3 {
    public static void main(String[] args) {
        BlockView blockView = new BlockView(null, 0, 0, 0);
        float minimumSpan = blockView.getMinimumSpan(BlockView.X_AXIS);
        System.out.println("Minimum Span: " + minimumSpan);
    }
}
