import javax.swing.SwingWorker;
import java.util.List;

public class SwingWorker_5 {
    public static void main(String[] args) {
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                return null;
            }

            @Override
            protected void process(List<String> chunks) {
                // Process the intermediate results received asynchronously
                for (String chunk : chunks) {
                    System.out.println(chunk);
                }
            }
        };
    }
}
