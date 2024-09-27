import javax.imageio.IIOParam;

public class IIOParam_5 {
    public static void main(String[] args) {
        IIOParam param = new IIOParam();
        int[] sourceBands = {0, 1, 2};
        param.setSourceBands(sourceBands);
    }
}
