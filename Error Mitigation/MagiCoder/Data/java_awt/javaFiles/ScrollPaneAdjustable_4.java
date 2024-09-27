import java.awt.ScrollPane;
import java.awt.Scrollbar;

public class ScrollPaneAdjustable_4 {
    public static void main(String[] args) {
        ScrollPane scrollPane = new ScrollPane();
        Scrollbar verticalScrollbar = scrollPane.getVerticalScrollBar();
        ScrollPaneAdjustable adjustable = verticalScrollbar;
        int unitIncrement = adjustable.getUnitIncrement();
        System.out.println("Unit Increment: " + unitIncrement);
    }
}
