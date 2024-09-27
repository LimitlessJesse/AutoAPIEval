import java.awt.Choice;

public class Choice_2 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        System.out.println("Before inserting: " + choice.getItem(1));
        
        // Inserting a new item at index 1
        choice.insert("New Option", 1);
        
        System.out.println("After inserting: " + choice.getItem(1));
    }
}
