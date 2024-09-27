import javax.swing.SwingUtilities;
import java.util.ArrayList;

public class SwingUtilities_1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ArrayList<String> list = new ArrayList<>();
                list.add("Hello");
                System.out.println(list);
            }
        });
    }
}
