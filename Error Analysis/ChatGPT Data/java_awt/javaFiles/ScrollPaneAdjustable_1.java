import java.awt.ScrollPaneAdjustable;

public class ScrollPaneAdjustable_1 {
    public static void main(String[] args) {
        ScrollPaneAdjustable adjustable = new ScrollPaneAdjustable();

        int unitIncrement = 10;
        adjustable.setUnitIncrement(unitIncrement);

        System.out.println("Unit Increment set to: " + adjustable.getUnitIncrement());
    }
}
