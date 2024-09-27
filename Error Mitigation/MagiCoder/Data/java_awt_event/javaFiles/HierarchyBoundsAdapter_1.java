import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;

public class HierarchyBoundsAdapter_1 {
    public static void main(String[] args) {
        HierarchyBoundsAdapter adapter = new HierarchyBoundsAdapter() {
            @Override
            public void ancestorMoved(HierarchyEvent e) {
                // Your code here
            }
        };
    }
}
