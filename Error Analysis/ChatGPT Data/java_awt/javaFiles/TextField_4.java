import java.awt.TextField;

public class TextField_4 {
    public static void main(String[] args) {
        TextField textField = new TextField();
        textField.setColumns(10);
        
        System.out.println("Number of columns set for the TextField: " + textField.getColumns());
    }
}
