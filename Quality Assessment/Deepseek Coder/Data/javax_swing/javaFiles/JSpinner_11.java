import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinner_11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JSpinner Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
        JSpinner spinner = new JSpinner(model);

        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSpinner source = (JSpinner) e.getSource();
                int value = (Integer) source.getValue();
                System.out.println("Spinner value: " + value);
            }
        });

        frame.getContentPane().add(spinner);
        frame.setVisible(true);
    }
}
