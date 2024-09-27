import javax.swing.plaf.synth.SynthSpinnerUI;
import java.lang.reflect.Method;

public class SynthSpinnerUI_1 {
    public static void main(String[] args) {
        SynthSpinnerUI spinnerUI = new SynthSpinnerUI();
        try {
            Method method = SynthSpinnerUI.class.getDeclaredMethod("installListeners");
            method.setAccessible(true);
            method.invoke(spinnerUI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
