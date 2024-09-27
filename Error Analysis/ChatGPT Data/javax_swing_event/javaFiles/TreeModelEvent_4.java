import javax.swing.event.TreeModelEvent;

public class TreeModelEvent_4 {
    public static void main(String[] args) {
        TreeModelEvent event = new TreeModelEvent(this, new int[]{0, 1, 2}, new Object[]{});
        int[] childIndices = event.getChildIndices();
        for (int index : childIndices) {
            System.out.println("Child Index: " + index);
        }
    }
}
