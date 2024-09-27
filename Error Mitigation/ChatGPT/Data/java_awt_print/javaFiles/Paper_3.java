import java.awt.print.Paper;

public class Paper_3 {
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.setSize(8.5 * 72, 11 * 72); // Setting the size to 8.5 x 11 inches
        
        System.out.println("Paper width: " + paper.getWidth());
        System.out.println("Paper height: " + paper.getHeight());
    }
}
