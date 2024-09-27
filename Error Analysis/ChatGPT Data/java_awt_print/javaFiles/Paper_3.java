import java.awt.print.Paper;

public class Paper_3 {
    public static void main(String[] args) {
        // Create a new Paper object
        Paper paper = new Paper();

        // Set the width and height of the paper
        paper.setSize(100.0, 200.0);

        // Display the width and height of the paper
        System.out.println("Paper width: " + paper.getWidth());
        System.out.println("Paper height: " + paper.getHeight());
    }
}
