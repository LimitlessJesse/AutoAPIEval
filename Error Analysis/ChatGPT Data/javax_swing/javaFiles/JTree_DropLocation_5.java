import javax.swing.JTree;

public class JTree_DropLocation_5 {
    public static void main(String[] args) {
        JTree.DropLocation dropLocation = new JTree.DropLocation(null, null, 0);
        String stringRepresentation = dropLocation.toString();
        System.out.println(stringRepresentation);
    }
}
