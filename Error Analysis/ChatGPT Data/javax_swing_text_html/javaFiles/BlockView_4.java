import javax.swing.text.html.BlockView;

public class BlockView_4 {
    public static void main(String[] args) {
        BlockView blockView = new BlockView(null, BlockView.Y_AXIS);
        float maxSpan = blockView.getMaximumSpan(BlockView.Y_AXIS);
        System.out.println("Maximum span on Y_AXIS: " + maxSpan);
    }
}
