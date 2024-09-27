import java.awt.*;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

public class HierarchyEvent_2 {
    public static void main(String[] args) {
        Panel panel = new Panel();
        
        panel.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                if ((e.getChangeFlags() & HierarchyEvent.SHOWING_CHANGED) != 0) {
                    System.out.println("Component visibility changed");
                }
            }
        });
    }
}
