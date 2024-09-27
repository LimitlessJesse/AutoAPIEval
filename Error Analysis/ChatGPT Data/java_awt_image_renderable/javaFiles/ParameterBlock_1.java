import java.awt.image.renderable.ParameterBlock;

public class ParameterBlock_1 {
    public static void main(String[] args) {
        ParameterBlock pb = new ParameterBlock();
        int numSources = pb.getNumSources();
        System.out.println("Number of sources: " + numSources);
    }
}
