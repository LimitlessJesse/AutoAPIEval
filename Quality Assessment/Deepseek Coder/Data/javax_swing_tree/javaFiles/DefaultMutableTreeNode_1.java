import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_1 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode childNode = new DefaultMutableTreeNode("Child");
        node.add(childNode);

        boolean isLeaf = childNode.isLeaf();
        System.out.println("Is the child node a leaf node? " + isLeaf);
    }
}
