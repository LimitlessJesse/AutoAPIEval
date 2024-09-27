import java.awt.geom.Dimension2D;

public class Dimension2D_4 {
    public static void main(String[] args) {
        Dimension2D dimension = new Dimension(10, 20);
        System.out.println("Before setting size: " + dimension.getWidth() + " x " + dimension.getHeight());
        
        setSize(dimension);
        
        System.out.println("After setting size: " + dimension.getWidth() + " x " + dimension.getHeight());
    }
    
    public static void setSize(Dimension2D d) {
        d.setSize(30, 40);
    }
}
