import java.awt.Choice;

public class Choice_5 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");

        // Get the item at index 1
        String item = choice.getItem(1);
        System.out.println(item);
    }
}
