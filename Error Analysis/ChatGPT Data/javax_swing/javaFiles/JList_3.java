import javax.swing.JList;

public class JList_3 {
    public static void main(String[] args) {
        String[] data = {"A", "B", "C"};
        JList<String> list = new JList<>(data);

        int selectedIndex = list.getSelectedIndex();
        System.out.println("Selected Index: " + selectedIndex);
    }
}
