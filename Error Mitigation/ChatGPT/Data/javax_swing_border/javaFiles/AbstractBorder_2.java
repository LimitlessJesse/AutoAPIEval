import javax.swing.border.AbstractBorder;

public class AbstractBorder_2 {
    public static void main(String[] args) {
        AbstractBorder border = new AbstractBorder() {
            @Override
            public boolean isBorderOpaque() {
                return false;
            }
        };
        
        System.out.println(border.isBorderOpaque());
    }
}
