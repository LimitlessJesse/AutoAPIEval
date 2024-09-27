import javax.swing.JList;
import javax.swing.plaf.basic.BasicListUI;
import java.awt.Rectangle;

public class BasicListUI_2 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        BasicListUI listUI = new BasicListUI();
        
        Rectangle cellBounds = listUI.getCellBounds(list, 0, 5);
        System.out.println("Cell Bounds: " + cellBounds);
    }
}
