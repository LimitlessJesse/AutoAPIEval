import java.awt.event.HierarchyEvent;
import java.awt.Component;

public class HierarchyEvent_5 {
    public static void main(String[] args) {
        Component component = new Component() {
            @Override
            public String paramString() {
                return "Custom component";
            }
        };
        
        HierarchyEvent event = new HierarchyEvent(component, HierarchyEvent.DISPLAYABILITY_CHANGED, component, null);
        System.out.println(event.paramString());
    }
}
