import java.awt.*;

public class Choice_10 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Select the second option
        choice.select(1);

        // Print the selected option
        System.out.println("Selected option: " + choice.getSelectedItem());
    }
}
