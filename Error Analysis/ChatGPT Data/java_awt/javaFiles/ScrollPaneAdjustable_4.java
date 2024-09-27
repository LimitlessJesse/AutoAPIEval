import java.awt.ScrollPaneAdjustable;

public class ScrollPaneAdjustable_4 {
    public static void main(String[] args) {
        ScrollPaneAdjustable adjustable = new ScrollPaneAdjustable() {
            @Override
            public int getBlockIncrement() {
                // Implement the getBlockIncrement method
                return 10;
            }
        };
        
        int blockIncrement = adjustable.getBlockIncrement();
        System.out.println("Block Increment: " + blockIncrement);
    }
}
