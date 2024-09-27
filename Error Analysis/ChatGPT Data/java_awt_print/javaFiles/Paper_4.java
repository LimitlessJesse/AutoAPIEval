import java.awt.print.Paper;

public class Paper_4 {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.setImageableArea(10.0, 10.0, 500.0, 700.0);

        System.out.println("Imageable area set successfully.");
    }
}
