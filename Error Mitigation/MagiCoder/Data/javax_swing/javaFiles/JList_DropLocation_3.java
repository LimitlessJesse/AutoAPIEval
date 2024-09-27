import javax.swing.JList;

public class JList_DropLocation_3 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        JList.DropLocation dropLocation = list.getDropLocation();
        boolean isInsert = dropLocation.isInsert();
        System.out.println("Is insert: " + isInsert);
    }
}
