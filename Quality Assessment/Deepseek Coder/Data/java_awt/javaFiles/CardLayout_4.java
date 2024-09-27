import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayout_4 {
    public static void main(String[] args) {
        Frame f = new Frame("CardLayout Example");
        f.setLayout(new CardLayout());
        f.setSize(400, 200);

        Panel p1 = new Panel();
        p1.setBackground(Color.red);
        Panel p2 = new Panel();
        p2.setBackground(Color.blue);

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");

        p1.add(b1);
        p2.add(b2);

        f.add(p1);
        f.add(p2);

        CardLayout cl = (CardLayout)(f.getLayout());

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);

        // Show the second card
        cl.show(f, "2");

        // Remove the first card
        cl.removeLayoutComponent(p1);

        // Show the first card again
        cl.show(f, "1");
    }
}
