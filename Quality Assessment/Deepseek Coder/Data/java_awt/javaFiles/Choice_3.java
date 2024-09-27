import java.awt.Choice;
import java.awt.EventQueue;

public class Choice_3 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Choice choice = new Choice();
                    choice.add("Item 1");
                    choice.add("Item 2");
                    choice.add("Item 3");

                    choice.remove(1); // Removes the item at index 1

                    for (int i = 0; i < choice.size(); i++) {
                        System.out.println(choice.getItem(i));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
