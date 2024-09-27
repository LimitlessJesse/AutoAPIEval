import javax.swing.plaf.metal.MetalSliderUI;
import java.awt.Graphics;
import java.lang.reflect.Method;

public class MetalSliderUI_3 {
    public static void main(String[] args) {
        MetalSliderUI sliderUI = new MetalSliderUI();
        Graphics g = null; // You need to provide a Graphics object here

        try {
            Method method = MetalSliderUI.class.getDeclaredMethod("paintTrack", Graphics.class);
            method.setAccessible(true);
            method.invoke(sliderUI, g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
