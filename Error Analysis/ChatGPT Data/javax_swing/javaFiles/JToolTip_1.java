import javax.swing.*;

public class JToolTip_1 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        toolTip.setTipText("This is a tooltip message");
        System.out.println("Tooltip text: " + toolTip.getTipText());
    }
}
