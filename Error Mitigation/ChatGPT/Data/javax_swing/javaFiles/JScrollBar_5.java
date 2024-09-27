import javax.swing.JScrollBar;

public class JScrollBar_5 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setOrientation(JScrollBar.VERTICAL);
        System.out.println("Scrollbar orientation set to: " + scrollBar.getOrientation());
    }
}
