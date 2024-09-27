import java.awt.ScrollPane;
import java.awt.Scrollbar;

public class ScrollPaneAdjustable_1 {
    public static void main(String[] args) {
        ScrollPane scrollPane = new ScrollPane();
        Scrollbar verticalScrollbar = scrollPane.getVerticalScrollBar();
        Scrollbar horizontalScrollbar = scrollPane.getHorizontalScrollBar();

        ScrollPaneAdjustable adjustable = verticalScrollbar;
        int blockIncrement = adjustable.getBlockIncrement();

        System.out.println("Block increment: " + blockIncrement);
    }
}
