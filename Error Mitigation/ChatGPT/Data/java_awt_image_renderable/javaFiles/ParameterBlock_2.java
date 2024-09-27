import java.awt.image.renderable.ParameterBlock;

public class ParameterBlock_2 {
    public static void main(String[] args) {
        ParameterBlock pb = new ParameterBlock();
        pb.addSource("source1");
        pb.addSource("source2");
        
        Object source = pb.getSource(1);
        System.out.println("Source at index 1: " + source);
    }
}
