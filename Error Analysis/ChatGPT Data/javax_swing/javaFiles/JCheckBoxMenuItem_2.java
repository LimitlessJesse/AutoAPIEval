import javax.swing.JCheckBoxMenuItem;

public class JCheckBoxMenuItem_2 {
    public static void main(String[] args) {
        JCheckBoxMenuItem checkBox = new JCheckBoxMenuItem("Enable feature", true);
        System.out.println(checkBox.getState());
    }
}
