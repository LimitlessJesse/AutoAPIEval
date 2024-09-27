import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_5 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode("Child");
        node.add(childNode);

        System.out.println("Is the child node a leaf? " + childNode.isLeaf());
    }
}
