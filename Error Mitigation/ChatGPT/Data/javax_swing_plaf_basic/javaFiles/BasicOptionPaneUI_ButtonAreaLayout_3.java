import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout;
import java.awt.Container;
import java.awt.Dimension;

public class BasicOptionPaneUI_ButtonAreaLayout_3 {
    public static void main(String[] args) {
        ButtonAreaLayout buttonAreaLayout = new ButtonAreaLayout();
        Container container = new Container();
        Dimension minimumSize = buttonAreaLayout.minimumLayoutSize(container);
        System.out.println("Minimum layout size: " + minimumSize);
    }
}
