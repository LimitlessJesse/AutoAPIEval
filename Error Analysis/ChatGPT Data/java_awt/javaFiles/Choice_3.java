import java.awt.Choice;

public class Choice_3 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        
        int index = 1;
        String selected = choice.getItem(index);
        System.out.println("Selected item at index " + index + ": " + selected);
    }
}
