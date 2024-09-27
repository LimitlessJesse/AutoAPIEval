import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_3 {
    public static void main(String[] args) {
        DefaultMutableTreeNode parentNode = new DefaultMutableTreeNode("Parent");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        
        parentNode.add(child1);
        parentNode.add(child2);
        
        System.out.println("Before removal:");
        System.out.println(parentNode.children());
        
        parentNode.remove(0); // Remove child at index 0
        
        System.out.println("After removal:");
        System.out.println(parentNode.children());
    }
}
