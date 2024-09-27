import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusAdapter_1 {
    public static void main(String[] args) {
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                // Add your implementation here
            }
        };
    }
}
