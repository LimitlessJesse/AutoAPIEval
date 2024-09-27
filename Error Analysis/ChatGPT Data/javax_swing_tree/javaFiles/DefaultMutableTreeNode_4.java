import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Enumeration;

public class DefaultMutableTreeNode_4 {
    public static void main(String[] args) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        root.add(child1);
        root.add(child2);

        Enumeration<DefaultMutableTreeNode> children = root.children();
        while (children.hasMoreElements()) {
            DefaultMutableTreeNode node = children.nextElement();
            System.out.println(node.getUserObject());
        }
    }
}
