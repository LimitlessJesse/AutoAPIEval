import javax.swing.event.TreeModelEvent;

public class TreeModelEvent_1 {
    public static void main(String[] args) {
        TreeModelEvent event = new TreeModelEvent(this, new Object[]{"path", "to", "node"});
        Object[] path = event.getPath();
        for (Object item : path) {
            System.out.println(item);
        }
    }
}
