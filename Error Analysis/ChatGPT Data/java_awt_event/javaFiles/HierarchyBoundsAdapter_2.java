import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;

public class HierarchyBoundsAdapter_2 {
    public static void main(String[] args) {
        // Create a HierarchyBoundsAdapter with overridden ancestorResized method
        HierarchyBoundsAdapter adapter = new HierarchyBoundsAdapter() {
            @Override
            public void ancestorResized(HierarchyEvent e) {
                System.out.println("Hierarchy event: ancestor resized");
            }
        };

        // Simulate calling ancestorResized method
        HierarchyEvent event = new HierarchyEvent(new Object(), HierarchyEvent.ANCESTOR_RESIZED, new Object(), new Object());
        adapter.ancestorResized(event);
    }
}
