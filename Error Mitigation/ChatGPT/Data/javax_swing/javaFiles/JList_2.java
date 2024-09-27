import javax.swing.JList;

public class JList_2 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        list.setSelectedIndex(0);
        int selectedIndex = list.getSelectedIndex();
        System.out.println("Selected Index: " + selectedIndex);
    }
}
