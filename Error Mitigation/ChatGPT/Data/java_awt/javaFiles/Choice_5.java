import java.awt.Choice;

public class Choice_5 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Select the item at index 1
        choice.select(1);

        // Print the selected item
        System.out.println("Selected item: " + choice.getSelectedItem());
    }
}
