import java.awt.print.Paper;

public class Paper_2 {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.setSize(612.0, 792.0); // Setting the paper size in points (8.5 x 11 inches)

        double width = paper.getWidth(); // Getting the width of the paper
        System.out.println("Paper width: " + width);
    }
}
