import java.awt.Choice;

public class Choice_4 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        System.out.println("Before removal:");
        for (int i = 0; i < choice.getItemCount(); i++) {
            System.out.println(choice.getItem(i));
        }
        
        // Removing element at index 1
        int index = 1;
        choice.remove(index);
        
        System.out.println("After removal:");
        for (int i = 0; i < choice.getItemCount(); i++) {
            System.out.println(choice.getItem(i));
        }
    }
}
