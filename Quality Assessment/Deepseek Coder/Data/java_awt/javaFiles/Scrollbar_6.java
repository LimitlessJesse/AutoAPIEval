import java.awt.Scrollbar;

public class Scrollbar_6 {
    public static void main(String[] args) {
        Scrollbar scrollbar = new Scrollbar();
        int blockIncrement = scrollbar.getBlockIncrement();
        System.out.println("Block Increment: " + blockIncrement);
    }
}
