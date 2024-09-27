import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_64 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("User Object");
        Object userObject = node.getUserObject();
        System.out.println(userObject);
    }
}
