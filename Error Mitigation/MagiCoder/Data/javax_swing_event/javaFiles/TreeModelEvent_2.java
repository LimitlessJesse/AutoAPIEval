import javax.swing.event.TreeModelEvent;

public class TreeModelEvent_2 {
    public static void main(String[] args) {
        TreeModelEvent event = new TreeModelEvent(null, new int[]{1, 2, 3});
        int[] childIndices = event.getChildIndices();
        for (int index : childIndices) {
            System.out.println(index);
        }
    }
}
