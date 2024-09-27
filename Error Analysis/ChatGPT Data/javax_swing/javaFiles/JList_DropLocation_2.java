import javax.swing.JList;

public class JList_DropLocation_2 {
    public static void main(String[] args) {
        JList<String> jList = new JList<>();
        JList.DropLocation dropLocation = jList.getDropLocation();
        int index = dropLocation.getIndex();
        System.out.println("Index: " + index);
    }
}
