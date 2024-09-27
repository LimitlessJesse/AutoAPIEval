import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;

public class BasicTreeUI_1 {
    public static void main(String[] args) {
        JTree tree = new JTree();
        BasicTreeUI treeUI = new BasicTreeUI();
        treeUI.installUI(tree);
    }
}
