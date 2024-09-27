import java.awt.image.renderable.ParameterBlock;

public class ParameterBlock_3 {
    public static void main(String[] args) {
        ParameterBlock parameterBlock = new ParameterBlock();
        Object source = parameterBlock.getSource(0);
        System.out.println("Source at index 0: " + source);
    }
}
