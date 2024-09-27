import javax.swing.JList;

public class JList_DropLocation_2 {
    public static void main(String[] args) {
        JList.DropLocation dropLocation = new JList.DropLocation(null, 0, true);
        boolean isInsert = dropLocation.isInsert();
        System.out.println("Is insert location: " + isInsert);
    }
}
