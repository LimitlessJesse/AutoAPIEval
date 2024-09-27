import javax.swing.*;

public class JList_DropLocation_5 {
    public static void main(String[] args) {
        JList<String> jList = new JList<>();
        JList.DropLocation location = jList.getDropLocation();
        boolean isInsert = location.isInsert();
        System.out.println("isInsert: " + isInsert);
    }
}
