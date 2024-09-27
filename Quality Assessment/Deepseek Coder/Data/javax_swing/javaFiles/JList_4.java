import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class JList_4 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> jList = new JList<>();

        // Create a ListModel
        ListModel<String> listModel = new ListModel<>() {
            ArrayList<String> data = new ArrayList<>();

            @Override
            public int getSize() {
                return data.size();
            }

            @Override
            public String getElementAt(int index) {
                return data.get(index);
            }

            @Override
            public void addListDataListener(ListDataListener l) {
            }

            @Override
            public void removeListDataListener(ListDataListener l) {
            }
        };

        // Set the ListModel to the JList
        jList.setModel(listModel);

        // Add elements to the ListModel
        listModel.data.add("Hello");
        listModel.data.add("World");

        // Use setSelectedValue method
        jList.setSelectedValue("Hello", true);
    }
}
