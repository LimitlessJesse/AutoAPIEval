import javax.swing.JScrollBar;

public class JScrollBar_5 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setValues(50, 10, 0, 100);
        
        System.out.println("New value: " + scrollBar.getValue());
        System.out.println("New extent: " + scrollBar.getVisibleAmount());
        System.out.println("New min: " + scrollBar.getMinimum());
        System.out.println("New max: " + scrollBar.getMaximum());
    }
}
