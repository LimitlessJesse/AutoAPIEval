import java.awt.EventQueue;
import java.util.ArrayList;

public class EventQueue_1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<String> list = new ArrayList<>();
                list.add("Hello");
                System.out.println(list);
            }
        });
    }
}
