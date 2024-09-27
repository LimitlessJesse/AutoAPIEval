import javax.swing.JTree;

public class JTree_DropLocation_1 {
    public static void main(String[] args) {
        JTree.DropLocation dropLocation = new JTree.DropLocation(null, null, 5);
        int childIndex = dropLocation.getChildIndex();
        System.out.println("Child index: " + childIndex);
    }
}
