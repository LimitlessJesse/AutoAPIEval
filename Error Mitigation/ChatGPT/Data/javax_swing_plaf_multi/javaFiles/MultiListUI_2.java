import javax.swing.JList;
import javax.swing.plaf.multi.MultiListUI;
import java.awt.Point;

public class MultiListUI_2 {
    public static void main(String[] args) {
        JList list = new JList();
        Point location = new Point(10, 20);
        
        MultiListUI multiListUI = new MultiListUI();
        int index = multiListUI.locationToIndex(list, location);
        
        System.out.println("Index: " + index);
    }
}
