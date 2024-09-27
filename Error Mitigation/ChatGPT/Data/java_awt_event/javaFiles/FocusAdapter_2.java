import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusAdapter_2 {
    public static void main(String[] args) {
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                // Add your implementation here
                System.out.println("Focus lost");
            }
        };
    }
}
