import javax.swing.plaf.synth.SynthTreeUI;
import javax.swing.JTree;
import java.awt.Graphics;

public class MyTreeUI extends SynthTreeUI {

    @Override
    public void update(Graphics g, JTree tree) {
        super.update(g, tree);
        // Your custom painting code here
    }
}
