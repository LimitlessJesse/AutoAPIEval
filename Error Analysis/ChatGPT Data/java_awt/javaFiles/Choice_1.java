import java.awt.Choice;

public class Choice_1 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.addItem("Option 1");
        choice.addItem("Option 2");
        System.out.println("Selected choice: " + choice.getSelectedItem());
    }
}
