import javax.swing.JList;

public class JList_DropLocation_1 {
    public static void main(String[] args) {
        JList.DropLocation dropLocation = new JList.DropLocation(null, 5);
        int index = dropLocation.getIndex();
        System.out.println("Index: " + index);
    }
}
