import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;

public class HierarchyBoundsAdapter_4 {
    public static void main(String[] args) {

        // Implementing the HierarchyBoundsAdapter
        HierarchyBoundsAdapter adapter = new HierarchyBoundsAdapter() {
            @Override
            public void ancestorMoved(HierarchyEvent e) {
                System.out.println("Ancestor moved event occurred");
            }
        };
    }
}
