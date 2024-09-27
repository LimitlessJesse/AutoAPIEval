import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

public class DefaultTreeCellRenderer_6 {
    public static void main(String[] args) {
        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("Blue");

        style.addChild(color);
        color.addChild(red);
        color.addChild(blue);

        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        Icon icon = new ImageIcon("path_to_your_icon.png");
        renderer.setLeafIcon(icon);

        JTree tree = new JTree(style);
        tree.setCellRenderer(renderer);

        JFrame frame = new JFrame();
        frame.add(new JScrollPane(tree));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
