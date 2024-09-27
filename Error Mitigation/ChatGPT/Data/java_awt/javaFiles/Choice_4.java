import java.awt.Choice;

public class Choice_4 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        int itemCount = choice.getItemCount();
        System.out.println("Number of items in the Choice menu: " + itemCount);
    }
}
