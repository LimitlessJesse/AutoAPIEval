import java.awt.Choice;

public class Choice_2 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        System.out.println("Before removing:");
        for (int i = 0; i < choice.getItemCount(); i++) {
            System.out.println(choice.getItem(i));
        }

        choice.remove(1);

        System.out.println("After removing:");
        for (int i = 0; i < choice.getItemCount(); i++) {
            System.out.println(choice.getItem(i));
        }
    }
}
