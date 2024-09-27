import javax.swing.*;
import java.awt.*;
import java.util.Comparator;

public class SortingFocusTraversalPolicy_2 {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);

        SortingFocusTraversalPolicy policy = new SortingFocusTraversalPolicy();
        policy.setComparator(new Comparator<Component>() {
            @Override
            public int compare(Component o1, Component o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        panel.setFocusTraversalPolicy(policy);
    }
}
