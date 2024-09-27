import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class BasicScrollBarUI_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        BasicScrollBarUI basicScrollBarUI = new BasicScrollBarUI();
        
        basicScrollBarUI.layoutHScrollbar(scrollBar);
    }
}
