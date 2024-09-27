import javax.swing.text.html.Option;

public class Option_1 {
    public static void main(String[] args) {
        Option option = new Option("label", "value");
        String label = option.getLabel();
        System.out.println("Label: " + label);
    }
}
