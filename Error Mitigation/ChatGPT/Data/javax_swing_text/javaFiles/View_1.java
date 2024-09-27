import javax.swing.text.View;

public class View_1 {
    public static void main(String[] args) {
        View view = new View(); // Instantiate the View class
        int startOffset = view.getStartOffset(); // Call the getStartOffset method
        System.out.println("Start offset: " + startOffset);
    }
}
