import javax.swing.JTree;

public class JTree_DynamicUtilTreeNode_5 {
    public static void main(String[] args) {
        JTree.DynamicUtilTreeNode node = new JTree.DynamicUtilTreeNode("Node");
        int childCount = node.getChildCount();
        System.out.println("Child count: " + childCount);
    }
}
