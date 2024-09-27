import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class JList_DropLocation_1 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        list.setModel(new ListModel<String>() {
            @Override
            public int getSize() {
                return 0;
            }

            @Override
            public String getElementAt(int index) {
                return null;
            }

            @Override
            public void addListDataListener(ListDataListener l) {
            }

            @Override
            public void removeListDataListener(ListDataListener l) {
            }
        });

        JList.DropLocation dropLocation = list.getDropLocation();
        int index = dropLocation.getIndex();
        System.out.println("Drop index: " + index);
    }
}
