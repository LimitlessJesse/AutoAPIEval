import javax.swing.DefaultListModel;

public class DefaultListModel_2 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Hello");
        listModel.addElement("World");

        // Get the first element
        String firstElement = listModel.get(0);
        System.out.println(firstElement);  // Output: Hello

        // Get the second element
        String secondElement = listModel.get(1);
        System.out.println(secondElement);  // Output: World
    }
}
