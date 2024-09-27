import javax.swing.TransferHandler.DropLocation;
import java.awt.Point;

public class TransferHandler_DropLocation_2 {
    public static void main(String[] args) {
        DropLocation dropLocation = new DropLocation();
        Point dropPoint = dropLocation.getDropPoint();
        System.out.println("Drop Point: " + dropPoint);
    }
}
