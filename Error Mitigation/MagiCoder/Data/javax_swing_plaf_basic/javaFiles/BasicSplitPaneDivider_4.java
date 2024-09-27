import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class BasicSplitPaneDivider_4 {
    public static void main(String[] args) {
        BasicSplitPaneDivider divider = new BasicSplitPaneDivider();
        int dividerSize = divider.getDividerSize();
        System.out.println("Divider size: " + dividerSize);
    }
}
