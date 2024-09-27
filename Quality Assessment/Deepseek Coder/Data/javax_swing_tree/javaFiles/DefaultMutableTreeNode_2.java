import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_2 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        node.setUserObject("User Object");
        System.out.println(node.getUserObject());
    }
}
