import javax.swing.JScrollBar;

public class JScrollBar_6 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        int blockIncrement = scrollBar.getBlockIncrement();
        System.out.println("Block Increment: " + blockIncrement);
    }
}
