import java.awt.ScrollPaneAdjustable;

public class ScrollPaneAdjustable_2 {
    public static void main(String[] args) {
        ScrollPaneAdjustable adjustable = new ScrollPaneAdjustable();
        adjustable.setBlockIncrement(10);
        
        int blockIncrement = adjustable.getBlockIncrement();
        System.out.println("Block Increment set to: " + blockIncrement);
    }
}
