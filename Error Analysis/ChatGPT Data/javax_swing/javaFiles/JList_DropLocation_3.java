import javax.swing.JList;

public class JList_DropLocation_3 {
    public static void main(String[] args) {
        JList.DropLocation dropLocation = new JList.DropLocation(null, 0, true);
        System.out.println("Is insert allowed: " + dropLocation.isInsert());
    }
}
