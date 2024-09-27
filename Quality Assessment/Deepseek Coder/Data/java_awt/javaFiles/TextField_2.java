import java.awt.TextField;

public class TextField_2 {
    public static void main(String[] args) {
        TextField textField = new TextField();
        textField.setColumns(10);
        System.out.println("Number of columns: " + textField.getColumns());
    }
}
