import javax.swing.text.GapContent;

public class GapContent_2 {
    public static void main(String[] args) {
        GapContent content = new GapContent();
        content.insertString(0, "Hello World!");
        String result = content.getString(6, 5);
        System.out.println(result); // Output: World
    }
}
