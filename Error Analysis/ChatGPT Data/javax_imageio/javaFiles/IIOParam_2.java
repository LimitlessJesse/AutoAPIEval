import javax.imageio.IIOParam;
import javax.imageio.IIOParamController;

public class IIOParam_2 {
    public static void main(String[] args) {
        IIOParam iioParam = new IIOParam();
        IIOParamController controller = new IIOParamController() {
            @Override
            public void activateController() {
                // Controller logic
            }
        };
        iioParam.setController(controller);
    }
}
