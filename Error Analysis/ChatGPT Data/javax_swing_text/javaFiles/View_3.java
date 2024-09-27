import javax.swing.text.View;

public class View_3 {
    public static void main(String[] args) {
        View view = new View();
        int axis = 0;
        int offset = 0;
        float pos = 0.0f;
        float len = 10.0f;
        
        // Creating a break view
        View breakView = view.breakView(axis, offset, pos, len);
        
        System.out.println("Break view created: " + breakView);
    }
}
