import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class GraphicsEnvironment_1 {
    public static void main(String[] args) {
        GraphicsDevice[] screenDevices = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        
        System.out.println("Number of Screen Devices: " + screenDevices.length);
        for(int i=0; i<screenDevices.length; i++){
            System.out.println("Screen Device " + (i+1) + ": " + screenDevices[i]);
        }
    }
}
