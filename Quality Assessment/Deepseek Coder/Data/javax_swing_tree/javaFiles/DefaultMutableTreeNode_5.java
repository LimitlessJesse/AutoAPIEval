import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_5 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        node.setAllowsChildren(true);
        System.out.println(node.getAllowsChildren());
    }
}
