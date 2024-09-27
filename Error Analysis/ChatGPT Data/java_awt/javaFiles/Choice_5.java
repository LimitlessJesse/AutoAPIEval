import java.awt.Choice;

public class Choice_5 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        System.out.println("Before removeAll(): " + choice.getItemCount());

        choice.removeAll();

        System.out.println("After removeAll(): " + choice.getItemCount());
    }
}
