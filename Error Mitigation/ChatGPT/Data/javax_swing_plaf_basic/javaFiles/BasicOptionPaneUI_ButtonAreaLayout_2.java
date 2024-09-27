import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonAreaLayout;
import java.awt.Container;
import java.awt.Dimension;

public class BasicOptionPaneUI_ButtonAreaLayout_2 {
    public static void main(String[] args) {
        ButtonAreaLayout buttonAreaLayout = new ButtonAreaLayout();
        Container container = new Container();
        Dimension preferredSize = buttonAreaLayout.preferredLayoutSize(container);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
