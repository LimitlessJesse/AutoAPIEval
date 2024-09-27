import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

public class BorderLayout_3 {
    public static void main(String[] args) {
        BorderLayout layout = new BorderLayout();
        Container target = new Container();
        Object constraints = BorderLayout.CENTER;
        
        Component component = layout.getLayoutComponent(target, constraints);
        
        if(component != null) {
            System.out.println("Component found at location: " + constraints);
        } else {
            System.out.println("No component found at location: " + constraints);
        }
    }
}
