import java.awt.Choice;

public class Choice_1 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.addItem("Option 1");
        choice.addItem("Option 2");
        choice.addItem("Option 3");
        
        // Print the items in the Choice menu
        for (int i = 0; i < choice.getItemCount(); i++) {
            System.out.println(choice.getItem(i));
        }
    }
}
