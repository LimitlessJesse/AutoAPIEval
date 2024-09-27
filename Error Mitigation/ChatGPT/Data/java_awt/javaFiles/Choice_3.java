import java.awt.Choice;

public class Choice_3 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        String itemAtIndex1 = choice.getItem(1);
        System.out.println("Item at index 1: " + itemAtIndex1);
    }
}
