import java.awt.TextField;

public class TextField_3 {
    public static void main(String[] args) {
        TextField textField = new TextField();
        int columns = textField.getColumns();
        System.out.println("Number of columns: " + columns);
    }
}
