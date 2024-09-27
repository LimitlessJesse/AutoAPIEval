import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyBoundsAdapter;

public class HierarchyBoundsAdapter_5 {
    public static void main(String[] args) {
        MyHierarchyBoundsAdapter adapter = new MyHierarchyBoundsAdapter();
        adapter.ancestorResized(null);
    }

    static class MyHierarchyBoundsAdapter extends HierarchyBoundsAdapter {
        @Override
        public void ancestorResized(HierarchyEvent e) {
            System.out.println("Ancestor Resized Event Occurred");
        }
    }
}
