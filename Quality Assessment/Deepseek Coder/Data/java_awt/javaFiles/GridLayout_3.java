import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayout_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(2, 2)); // Initializing GridLayout with 2 rows and 2 columns

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));

        frame.pack();
        frame.setVisible(true);

        GridLayout layout = (GridLayout) frame.getLayout();
        layout.setRows(3); // Changing the number of rows to 3

        frame.revalidate(); // Refreshing the layout
    }
}
