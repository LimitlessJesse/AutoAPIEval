import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_1 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Node 1");
        System.out.println("Before setUserObject: " + node.getUserObject());
        
        node.setUserObject("Updated Node 1");
        System.out.println("After setUserObject: " + node.getUserObject());
    }
}
