import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;

public class HierarchyBoundsAdapter_2 {
    public static void main(String[] args) {
        HierarchyBoundsAdapter adapter = new HierarchyBoundsAdapter() {
            @Override
            public void ancestorResized(HierarchyEvent e) {
                // Your code here
            }
        };
    }
}
