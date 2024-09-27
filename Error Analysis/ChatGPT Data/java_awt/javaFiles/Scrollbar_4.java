import java.awt.Scrollbar;

public class Scrollbar_4 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setBlockIncrement(10);
        System.out.println("Block Increment set to: " + scrollbar.getBlockIncrement());
    }
}
