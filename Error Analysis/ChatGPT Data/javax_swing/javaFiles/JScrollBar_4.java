import javax.swing.JScrollBar;

public class JScrollBar_4 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBlockIncrement(10);
        System.out.println("Block increment set to: " + scrollBar.getBlockIncrement());
    }
}
