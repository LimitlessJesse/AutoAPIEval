import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_3 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode("Child");
        node.addChild(childNode);

        Object userObject = childNode.getUserObject();
        System.out.println(userObject);
    }
}
