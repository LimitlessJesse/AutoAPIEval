import java.awt.TextArea;

public class TextArea_7 {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.append("Hello, World!");
        int rows = textArea.getRows();
        System.out.println("Number of rows: " + rows);
    }
}
