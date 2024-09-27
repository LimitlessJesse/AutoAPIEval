import javax.swing.AbstractListModel;

public class AbstractListModel_2 {
    public static void main(String[] args) {
        // Create a custom AbstractListModel
        AbstractListModel<String> model = new AbstractListModel<String>() {
            @Override
            public int getSize() {
                return 0;
            }

            @Override
            public String getElementAt(int index) {
                return null;
            }
        };

        // Fire interval added event
        model.fireIntervalAdded(model, 0, 5);
    }
}
