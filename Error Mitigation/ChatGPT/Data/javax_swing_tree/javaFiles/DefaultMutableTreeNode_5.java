import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_5 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Parent");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        
        node.add(child1);
        node.add(child2);
        
        int childCount = node.getChildCount();
        System.out.println("Number of children: " + childCount);
    }
}
