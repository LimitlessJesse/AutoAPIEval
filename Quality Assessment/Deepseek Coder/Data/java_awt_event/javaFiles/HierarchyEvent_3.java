import java.awt.Component;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

public class HierarchyEvent_3 {
    public static void main(String[] args) {
        Component component = new Component() {
            @Override
            public HierarchyEvent.HierarchyChangeInfo[] getHierarchyEvents() {
                return new HierarchyEvent.HierarchyChangeInfo[0];
            }
        };

        HierarchyListener hierarchyListener = new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                if (e.getChangeFlags() == HierarchyEvent.HIERARCHY_CHANGED) {
                    Component changedComponent = e.getChanged();
                    System.out.println("Changed component: " + changedComponent);
                }
            }
        };

        component.addHierarchyListener(hierarchyListener);

        // Simulate a hierarchy change
        Component childComponent = new Component() {
            @Override
            public HierarchyEvent.HierarchyChangeInfo[] getHierarchyEvents() {
                return new HierarchyEvent.HierarchyChangeInfo[0];
            }
        };
        component.add(childComponent);
    }
}
