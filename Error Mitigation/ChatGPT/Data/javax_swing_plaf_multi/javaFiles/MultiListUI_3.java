import javax.swing.JList;
import javax.swing.plaf.multi.MultiListUI;
import java.awt.Rectangle;

public class MultiListUI_3 {
    public static void main(String[] args) {
        JList list = new JList();
        MultiListUI multiListUI = new MultiListUI();
        int index1 = 0;
        int index2 = 1;
        Rectangle cellBounds = multiListUI.getCellBounds(list, index1, index2);
        System.out.println("Cell bounds: " + cellBounds);
    }
}
