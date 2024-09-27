import javax.swing.tree.DefaultMutableTreeNode;

public class DefaultMutableTreeNode_1 {
    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode("Root");
        Object obj = "User object";
        node.setUserObject(obj);
        
        System.out.println(node.getUserObject());
    }
}
