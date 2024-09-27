import javax.swing.JScrollPane;

public class JScrollPane_3 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        int policy = scrollPane.getVerticalScrollBarPolicy();
        System.out.println("Vertical ScrollBar Policy: " + policy);
    }
}
