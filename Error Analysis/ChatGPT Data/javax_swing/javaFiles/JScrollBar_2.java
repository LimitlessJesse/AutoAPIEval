import javax.swing.*;

public class JScrollBar_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        BoundedRangeModel model = new DefaultBoundedRangeModel();
        scrollBar.setModel(model);
    }
}
