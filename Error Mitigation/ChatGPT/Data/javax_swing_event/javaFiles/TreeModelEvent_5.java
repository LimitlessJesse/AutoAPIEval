import javax.swing.event.TreeModelEvent;

public class TreeModelEvent_5 {
    public static void main(String[] args) {
        TreeModelEvent event = new TreeModelEvent(this, new Object[]{1, 2, 3}, new int[]{0, 1, 2}, new Object[]{4, 5, 6});
        int[] childIndices = event.getChildIndices();
        for (int index : childIndices) {
            System.out.println("Index: " + index);
        }
    }
}
