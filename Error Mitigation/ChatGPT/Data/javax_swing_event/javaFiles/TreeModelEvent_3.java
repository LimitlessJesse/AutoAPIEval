import javax.swing.event.TreeModelEvent;

public class TreeModelEvent_3 {
    public static void main(String[] args) {
        TreeModelEvent event = new TreeModelEvent(this, new Object[]{"child1", "child2"}, new int[]{0, 1}, null);
        Object[] children = event.getChildren();
        for (Object child : children) {
            System.out.println(child);
        }
    }
}
