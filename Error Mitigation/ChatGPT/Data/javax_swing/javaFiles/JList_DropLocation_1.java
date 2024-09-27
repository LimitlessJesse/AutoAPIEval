import javax.swing.DropMode;
import javax.swing.JList;

public class JList_DropLocation_1 {
    public static void main(String[] args) {
        JList list = new JList();
        JList.DropLocation dropLocation = list.getDropLocation();
        int index = dropLocation.getIndex();
        System.out.println("Drop index: " + index);
    }
}
