import java.awt.ScrollPaneAdjustable;

public class ScrollPaneAdjustable_5 {
    public static void main(String[] args) {
        ScrollPaneAdjustable adjustable = new ScrollPaneAdjustable();
        int newValue = 50;
        adjustable.setValue(newValue);
        System.out.println("New value set: " + adjustable.getValue());
    }
}
