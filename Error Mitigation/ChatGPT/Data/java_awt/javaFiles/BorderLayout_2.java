import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

public class BorderLayout_2 {
    public static void main(String[] args) {
        BorderLayout layout = new BorderLayout();
        Container container = new Container();
        Component component = new Component();
        
        layout.addLayoutComponent("north", component);
    }
}
