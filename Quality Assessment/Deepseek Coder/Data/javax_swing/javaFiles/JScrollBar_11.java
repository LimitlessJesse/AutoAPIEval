import javax.swing.JScrollBar;

public class JScrollBar_11 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBlockIncrement(10);
        System.out.println("Block Increment: " + scrollBar.getBlockIncrement());
    }
}
